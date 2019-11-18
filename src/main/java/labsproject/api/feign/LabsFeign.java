package labsproject.api.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import labsproject.api.entity.LabRequest;
import labsproject.api.entity.User;

@FeignClient(name = "labs-api", url = "http://localhost:10030")

public interface LabsFeign {
	@GetMapping("/labrequest/list")
	public Iterable<LabRequest> getList();
	
	@GetMapping("/labrequest/userlist/{id}")
	public Iterable<LabRequest> getUserList(@PathVariable Long id);
	
	@GetMapping("/labrequest/{id}")
	public LabRequest getById(@PathVariable String id);
	
	@PostMapping(path="/add", consumes = {"application/json"})
	public @ResponseBody String Insert (@RequestBody Map<String, Object> json);
	
	@PutMapping(path="/edit/{id}", consumes = {"application/json"})
	public @ResponseBody String Update (@RequestBody Map<String, Object> json, @PathVariable String id);
    
}
