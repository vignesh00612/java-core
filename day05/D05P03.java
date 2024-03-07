package com.learning.day05;
import java.util.HashSet;

class Product {
    private String productId;
    private String productName;

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

    @Override
    public int hashCode() {
        return productId.hashCode(); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Product product = (Product) obj;
        return productId.equals(product.productId);
    }

    @Override
    public String toString() {
        return productId + " " + productName;
    }
}

public class D05P03 {
    public static void main(String[] args) {
        
        HashSet<Product> productSet = new HashSet<>();

        productSet.add(new Product("P001", "Maruti 800"));
        productSet.add(new Product("P002", "Marutizen"));
        productSet.add(new Product("P003", "Maruti Dezire"));
        productSet.add(new Product("P004", "Maruti Alto"));

      
        for (Product product : productSet) {
            System.out.println(product);
        }
    }
}


