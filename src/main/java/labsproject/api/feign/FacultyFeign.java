package labsproject.api.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import labsproject.api.entity.Building;
import labsproject.api.entity.Faculty;
import labsproject.api.entity.User;

@FeignClient(name = "university-api", url = "http://localhost:10010")

public interface FacultyFeign {
	@GetMapping("/faculty/list")
	public List<Faculty> getList();
}
