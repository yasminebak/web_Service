package ProductService.DTO;

import ProductService.Entity.Client;

public class ClientDTO {
	private String firstname;
	private String lastname;
	private Integer session;

	public ClientDTO() {
	}
	public ClientDTO(Client client, Integer session) {
		this.firstname = client.getFirstname();
		this.lastname = client.getLastname();
		this.session = session;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getSession() {
		return session;
	}

	public void setSession(Integer session) {
		this.session = session;
	}
	
}
