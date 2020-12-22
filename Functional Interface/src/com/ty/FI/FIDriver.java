package com.ty.FI;

public class FIDriver {
 public static void main(String[] args) {
	
	 //Using Lambda Exp to implement FI
	 Printable p=()-> System.out.println("Rakesh");
	 
	 p.printName();
}
}
