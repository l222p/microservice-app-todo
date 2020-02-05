package microservices.app.authorizationservice.models.dto;

import java.io.Serializable;

public class UserDto implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5042193847965920639L;
	
	private String id;

	private String userId;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
    
	public UserDto() {
		super();
	}

	public UserDto(String id, String userId, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}