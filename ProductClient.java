package com.kpmg.streamIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductClient {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

//		Product product = new Product(123, "samsung", 20000, "electronics");
//
//		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("products_info.txt"));
//
//		output.writeObject(product);
//
//		System.out.println("Object saved Successfully");

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("products_info.txt"));
		Product product = (Product) input.readObject();
		System.out.println(product);

	}

}
