package labsproject.api.controller;


import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import labsproject.api.entity.Building;
import labsproject.api.entity.Faculty;
import labsproject.api.entity.LabRequest;
import labsproject.api.entity.User;
import labsproject.api.feign.BuildingFeign;
import labsproject.api.feign.FacultyFeign;
import labsproject.api.feign.LabsFeign;
import labsproject.api.feign.TeacherFeign;
import labsproject.api.feign.UserFeign;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.PUT})

@RequestMapping(path="/labrequest")
public class LabRequestController {
	
	@Autowired
	private LabsFeign labRequestfeign;
		
	@GetMapping("/list")
	public Iterable<LabRequest> getList(){
		return labRequestfeign.getList();
	}
	
	@GetMapping("/userlist/{id}")
	public Iterable<LabRequest> getUserList(@PathVariable Long id){
		return labRequestfeign.getUserList(id);
	}
	
	@GetMapping("/{id}")
	public LabRequest getById(@PathVariable String id) {
		return labRequestfeign.getById(id);
	}
	
	@Autowired
	private UserFeign userFeign; 
	@Autowired
	private BuildingFeign buildingFeign;
	@Autowired
	private TeacherFeign teacherFeign;

	@Autowired
	private FacultyFeign faculty;
	
	@GetMapping(value = "/faculty", consumes = {"application/json"}, produces ="application/json")
	public List<Faculty> listFaculty() {	
		return faculty.getList();
	}
	
	@GetMapping(value = "/teacher", consumes = {"application/json"}, produces ="application/json")
	public List<User> listUser() {	
		return teacherFeign.getList();
	}
		
	@GetMapping(value = "/building", consumes = {"application/json"}, produces ="application/json")
	public List<Building> list() {	
		return buildingFeign.getList();
	}
	
	@PostMapping(value = "/login", consumes = {"application/json"}, produces ="application/json")
	public User login(@RequestBody Map<String, Object> payload) {	
		User user = userFeign.login(payload);	
		return user;
	}
	@PostMapping(path="/add", consumes = {"application/json"})
	public @ResponseBody String Insert (@RequestBody Map<String, Object> json) {
		try {
			labRequestfeign.Insert(json);
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}
	@PutMapping(path="/edit/{id}", consumes = {"application/json"})
	public @ResponseBody String Update (@RequestBody Map<String, Object> json, @PathVariable String id) {
		try {
			labRequestfeign.Update(json,id);			
			return "Saved";	
		}
		catch(Exception ex){
			return "Error: "+ex;	
		}			
	}	
	
}
