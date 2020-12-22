package com.rakesh.demo;

import java.util.function.BiFunction;

/*
Reference to a static method.
Reference to an instance method.
Reference to a constructor
*/
class Arithmetic {
	public static int add(int a, int b) {
		return a + b;
	}
}

interface Print {
	void draw();
}

class ThreadDemo {
	public static void runner() {
		System.out.println("Thread1");
	}
}

public class Demo {
	 static void drawSomething() {
		System.out.println("Implementation");
	}

	public static void main(String[] args) {
		//1. Referring static method
		Print print = Demo::drawSomething;
		// Calling interface method
		print.draw();
		// we are using predefined functional interface Runnable to refer static method.
		Thread t1 = new Thread(ThreadDemo::runner);
		t1.start();
		
		//we are using BiFunction interface and using it's apply() method.
		//The BiFunction interface allows us to use parameters of different types, with a return value of a third type.
		BiFunction<Integer, Integer, Integer> biFunction=Arithmetic::add;
		int result=biFunction.apply(10, 20);
		System.out.println("bifunction-->"+result);
		
		//2.Reference to an Instance Method
		//Print print1 = new Demo()::drawSomething;
		
		//3.Reference to a Constructor
		//ClassName::new  
	}
}
