package ProductService.DTO;

public class UserDTO {

	private String email;
	private String password;

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

	public static boolean verify(UserDTO userDTO) {
		String email = userDTO.email;
		String password = userDTO.password;
		return email != null && password != null && email.trim().length() > 0 && password.trim().length() > 0;
	}
}

