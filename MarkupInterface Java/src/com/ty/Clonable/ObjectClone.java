package com.ty.Clonable;

public class ObjectClone  implements Cloneable{
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public ObjectClone(String data) {
		this.data = data;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
