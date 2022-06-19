package model;

public class Employee {
	private String firstName;
	private String lastName;
	private String deptType;
	private String email;
	char[] password;
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDeptName(String deptType) {
		this.deptType = deptType;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(char[] password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getDeptName() {
		return deptType;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char[] getPassword() {
		return password;
	}

}
