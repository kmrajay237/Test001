package javaStreamConcepts;

import java.util.ArrayList;
import java.util.List;

public class Filter_Test_04 {
	public static void main(String[] args) {
		List<Product> pList = new ArrayList<Product>();
		pList.add(new Product(101, "Phone", 32000));
		pList.add(new Product(102, "Tablet", 35000));
		pList.add(new Product(103, "Laptop", 22000));
		pList.add(new Product(104, "Gold", 56000));
		pList.add(new Product(105, "Silver", 28000));
		
		pList.stream()
				.filter(p->p.price>25000) //filtering
				.forEach(pr->System.out.println(pr.price));  //iterating on filter objects
	}
}

class Product {
	int id;
	String name;
	double price;

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
