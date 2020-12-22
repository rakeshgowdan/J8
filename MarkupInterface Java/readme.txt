Marker interface 
		is an interface which is empty, i.e. it does not contain any methods or fields. 


1.It is also known as a tagging interface and is used to indicate or inform the JVM that
	a class implementing this interface will have some special behaviour. 
2.An efficient way to classify code can be achieved using the marker interface. 
3.Examples of such an interface are: Serializable, Cloneable and Remote Interface.


Types:
1.Serializable Interface
	Serialization in java can be defined as the process of converting the state of an object
 		into a byte stream. 
    This can be achieved by using the serializable interface which is
  		present in java.io.package. 
    It must be noted that the all subtypes of a serializable class are themselves 
		serializable.
		
		
2.Cloneable Interface:
		This interface can be found in the java.lang package. 
		Cloning is the mechanism of generating a replica or an exact copy of an object with
		 a different name.
		The Cloneable Interface is implemented by a class to indicate to the object.
		clone() method that it is legal for the method to make a field-for-field copy of 
		instances of that class.
		A CloneNotSupportedException is thrown for a class which invokes the clone method
		 without implementing a cloneable interface.
		 
		 
3.Remote Interface:
		A remote object can be defined as an object whose methods can be invoked from a different JVM,
		 potentially on another host. This interface is found in the java.rmi package. 
		A remote object must implement this method directly or indirectly.
		
		
		Steps to implemente remote interface
		1. define remote interface 
		2.implement RI
				a.Extend the UnicastRemoteObject class
				b.Use the exportObject() method of the UnicastRemoteObject class
		
		
		