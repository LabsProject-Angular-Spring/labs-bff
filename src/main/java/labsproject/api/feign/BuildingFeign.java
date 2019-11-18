package labsproject.api.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import labsproject.api.entity.Building;

@FeignClient(name = "university-api", url = "http://localhost:10010")

public interface BuildingFeign {
	@GetMapping("/building/list")
	public List<Building> getList();
    
}
