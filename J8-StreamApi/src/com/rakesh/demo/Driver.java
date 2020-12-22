package com.rakesh.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();
		// Adding Products
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));
		//travesing
		productsList.stream().forEach(product->System.out.println(product));
		List<Float> productPriceList = new ArrayList<Float>();
		for (Product product : productsList) {

			// filtering data of list
			if (product.getPrice() > 30000) {
				productPriceList.add(product.getPrice()); // adding price to a productPriceList
			}
		}
		System.out.println(productPriceList); // displaying data
		
		List<Float> productPriceList1 =productsList.stream()
										.filter(p -> p.getPrice()>30000)
										.map(p->p.getPrice())
										.collect(Collectors.toList());
		System.out.println(productPriceList1);
	}

	
}
