package labsproject.api.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import labsproject.api.entity.Building;
import labsproject.api.entity.User;

@FeignClient(name = "university-api", url = "http://localhost:10020")

public interface TeacherFeign {
	@GetMapping("/user/userstype/1")
	public List<User> getList();
}
