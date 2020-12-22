package com.rakesh.demo;

import java.util.StringJoiner;

public class Demo {

	public static void main(String[] args) {
		
		StringJoiner stringJoin=new StringJoiner(";");
		stringJoin.add("raj");
		stringJoin.add("bangalore");
		stringJoin.add("karnataka");
		stringJoin.add("india");
		System.out.println(stringJoin);
		//delimiter,prefix,sufix
		StringJoiner stringJoin1=new StringJoiner(",", "[", "]");
		stringJoin1.add("raj");
		stringJoin1.add("bangalore");
		stringJoin1.add("karnataka");
		stringJoin1.add("india");
		System.out.println(stringJoin1);
	}

}
