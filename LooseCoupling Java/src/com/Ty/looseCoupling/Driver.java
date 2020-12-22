package com.Ty.looseCoupling;

public class Driver {
public static void main(String[] args) {
	
	//by interface we achieve we achieve loose coupling by injecting the dependency
	Engine eg=new BMW();
	
	eg.engineRun();
	eg=new Maruti();
	eg.engineRun();
}
}
