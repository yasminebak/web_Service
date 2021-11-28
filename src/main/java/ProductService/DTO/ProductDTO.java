package ProductService.DTO;

public class ProductDTO {
	private String id;
	private String type;
	private String nameProduct;
	private float price;
	private String statProduct=" ";
	private float noteProduct;
	private boolean available;
	private int stock;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStatProduct() {
		return statProduct;
	}
	public void setStatProduct(String statProduct) {
		this.statProduct = statProduct;
	}
	public float getNoteProduct() {
		return noteProduct;
	}
	public void setNoteProduct(float noteProduct) {
		this.noteProduct = noteProduct;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	

// getters and setters
// boolean return method verify string id = product.id ???
	public static boolean verify(ProductDTO product) {
		String id = product.id;
		return id != null && id.trim().length() > 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof ProductDTO))
			return false;
		return id.equals(((ProductDTO) obj).id);
	}
}
