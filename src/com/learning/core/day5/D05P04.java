package com.learning.core.day05;

import java.util.HashSet;

class Product {
	public String productId;
	public String productName;

	public Product(String productId, String productName) {
		this.productId = productId;
		this.productName = productName;
	}

	public String getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Product product = (Product) obj;
		return productId.equals(product.productId);
	}

	public int hashCode() {
		return productId.hashCode();
	}
}

public class D05P04 {
	public static void main(String[] args) {
		HashSet<Product> productSet = new HashSet<>();

		productSet.add(new Product("P001", "iPhone 13"));
		productSet.add(new Product("P002", "Samsung Galaxy S21"));
		productSet.add(new Product("P003", "Maruti Dezire"));
		productSet.add(new Product("P004", "Sony PlayStation 5"));

		String searchProductId = "P003";
		String searchProductName = "Maruti Dezire";
		Product searchProduct = new Product(searchProductId, searchProductName);

		if (productSet.contains(searchProduct)) {
			System.out.println("Product Found");
		} else {
			System.out.println("Product Not Found");
		}
	}
}
