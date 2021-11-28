package ProductService.Entity;



import java.util.Objects;

public class Client {
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private String iban;
	private Cart cart;
	private String currency;

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

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}


	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void clearCart() {
		cart = new Cart();
	}

	public static boolean verify(Client client) {
		try {
			Objects.requireNonNull(client.currency);
			Objects.requireNonNull(client.email);
			Objects.requireNonNull(client.firstname);
			Objects.requireNonNull(client.iban);
			Objects.requireNonNull(client.lastname);
			Objects.requireNonNull(client.password);
			return true;
		} catch (NullPointerException e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return email + ", " + password + ", " + firstname + ", " + lastname + ", " + iban + ", " 
				+ currency;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Client))
			return false;
		return email.equals(((Client) obj).email);
	}

	@Override
	public int hashCode() {
		return email.hashCode();
	}
}
