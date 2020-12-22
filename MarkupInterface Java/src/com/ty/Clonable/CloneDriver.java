package com.ty.Clonable;

public class CloneDriver {
public static void main(String[] args) {
	
	ObjectClone oc=new ObjectClone("Hello");
	
	System.out.println(oc.getData());
	
	ObjectClone oc1=null;
	try {
		 oc1=(ObjectClone)oc.clone();
	} catch (CloneNotSupportedException e) {
		System.out.println("Clone Not supported !!");
	}
	
	System.out.println("After cloning");
	System.out.println(oc1.getData());
}
}
