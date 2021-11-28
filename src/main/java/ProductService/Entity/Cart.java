package ProductService.Entity;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ProductService.DTO.ProductDTO;



public class Cart implements Iterable<ProductDTO> {
	private List<ProductDTO> products;

	public Cart() {
		products = new ArrayList<>();
	}

	public void add(ProductDTO product) {
		products.add(product);
	}

	public boolean remove(ProductDTO product) {
		return products.remove(product);
	}

	public void clear() {
		products.clear();
	}

	public boolean contains(ProductDTO product) {
		return products.contains(product);
	}

	public double getPrice() {
		double price = 0;
		for (ProductDTO product : products) {
			price += product.getPrice();
		}
		return price;
	}

	public List<ProductDTO> products() {
		return this.products;
	}

	@Override
	public Iterator<ProductDTO> iterator() {
		return products.iterator();
	}

}

