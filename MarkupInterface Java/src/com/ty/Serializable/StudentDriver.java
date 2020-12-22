package com.ty.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDriver {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student s1=new Student(101,"Rakesh N");
		
		//Seralizing
		FileOutputStream Fileobj = new FileOutputStream("data.txt");
		ObjectOutputStream obj = new ObjectOutputStream(Fileobj);
		obj.writeObject(s1);
		
		// De-serializing 'obj'
		FileInputStream fis = new FileInputStream("data.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student  s2 = (Student)ois.readObject(); //down-casting object
		System.out.println(s2.getId()+" "+s2.getName());
			
		// closing streams
		obj.close();
		ois.close();
	}
}
