// default package
// Generated Apr 27, 2014 6:28:34 PM by Hibernate Tools 4.0.0

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer id;
	private String name;
	private String address;
	private String emailId;

	public User() {
	}

	public User(String name, String address, String emailId) {
		this.name = name;
		this.address = address;
		this.emailId = emailId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}