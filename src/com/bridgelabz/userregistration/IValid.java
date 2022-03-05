package com.bridgelabz.userregistration;

@FunctionalInterface 
public interface IValid {
	public boolean validate(String regex, String data);
}
