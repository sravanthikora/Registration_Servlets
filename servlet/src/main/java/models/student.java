package models;

public class student {
	
	private int id;
	private String name;
	private String branch;
	private String email;
	private Long phoneno;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int id, String name, String branch, String email, Long phoneno) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.phoneno = phoneno;
	}

}