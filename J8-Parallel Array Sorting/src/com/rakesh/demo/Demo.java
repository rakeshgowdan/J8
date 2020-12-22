package com.rakesh.demo;

import java.util.Arrays;

public class Demo {
public static void main(String[] args) {
	 int[] arr = {5,8,1,0,6,9,50,-3};  
	 System.out.print("Before-> ");
	 for(int i:arr) {System.out.print(i+"\t");};
	Arrays.sort(arr);
	//sort
	System.out.print("\nAfter-> ");
	for(int i:arr) {System.out.print(i+"\t");};
	//custom sort
	 Arrays.parallelSort(arr,0,4);  
		System.out.print("\nCustomSort-> ");
		for(int i:arr) {System.out.print(i+"\t");};
}
}
