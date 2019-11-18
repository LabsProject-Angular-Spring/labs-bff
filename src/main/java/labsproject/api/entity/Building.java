package labsproject.api.entity;

public class Building{


	private Long id;
	
	private String name;
	
	private Long facultyid;
	
	public Building(long id, String name, Long facultyid) {
		this.id = id;
		this.name = name;
		this.facultyid = facultyid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Long getFacultyId() {
		return facultyid;
	}

	public void setFacultyId(Long facultyid) {
		this.facultyid = facultyid;
	}
	
}
