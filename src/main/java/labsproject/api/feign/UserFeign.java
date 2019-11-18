package labsproject.api.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import labsproject.api.entity.User;

@FeignClient(name = "user-api", url = "http://localhost:10020")

public interface UserFeign {
    @PostMapping(value = "/user/login", consumes = {"application/json"}, produces = {"application/json"} )
    User login(@RequestBody Map<String, Object> payload);
    
}
