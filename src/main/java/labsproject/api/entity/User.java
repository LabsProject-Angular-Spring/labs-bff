package labsproject.api.entity;

public class User {
	
	public User (Long id, String name, String email, String username, String password, Integer usertype) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.userName = username;
		this.password = password;
		this.userType = usertype;
	}

	private Long id;
	
	private String name;
	
	private String email;
	
	private String userName;
	
	private String password;
	
	private Integer userType;	
	
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
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String username) {
		this.userName = username;
	}	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer usertype) {
		this.userType = usertype;
	}

}
