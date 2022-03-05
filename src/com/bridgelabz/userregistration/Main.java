package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.bridgelabz.userregistration.exceptions.UserRegistrationException;
import com.bridgelabz.userregistration.regularexpressions.ConstantRegEx;

public class Main {

	public static void main(String[] args) {
		
		IValid isValidFirstName = (pattern, fName) -> {
			try {
				if(! Pattern.matches(ConstantRegEx.FIRST_NAME_REGEX, fName)) 
					throw new UserRegistrationException("Invalid First Name");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidFirstName.validate(ConstantRegEx.FIRST_NAME_REGEX, "Rekha"));
		
		IValid isValidLastName = (pattern, lName) -> {
			try {
				if(! Pattern.matches(ConstantRegEx.LAST_NAME_REGEX, lName)) 
					throw new UserRegistrationException("Invalid Last Name");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidLastName.validate(ConstantRegEx.LAST_NAME_REGEX, "Kallutla"));

		IValid isValidMobileNumber = (pattern, mobileNumber) -> {
			try {
				if(! Pattern.matches(ConstantRegEx.MOBILE_NUMBER_REGEX, mobileNumber)) 
					throw new UserRegistrationException("Invalid Mobile Number");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidMobileNumber.validate(ConstantRegEx.MOBILE_NUMBER_REGEX, "9059903113"));

		IValid isValidEMail = (pattern, eMail) -> {
			try {
				if(! Pattern.matches(ConstantRegEx.USER_EMAIL_REGEX, eMail)) 
					throw new UserRegistrationException("Invalid EMail Address");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidEMail.validate(ConstantRegEx.USER_EMAIL_REGEX, "abc@gmail.com"));

		
		IValid isValidPassword = (pattern, password) -> {
			try {
				if(! Pattern.matches(ConstantRegEx.PASSWORD_REGEX, password)) 
					throw new UserRegistrationException("Invalid Password");
			
			} catch(UserRegistrationException e) {
				e.printStackTrace();
				return false;
			}
			return true;
		};
		
		System.out.println(
				isValidPassword.validate(ConstantRegEx.PASSWORD_REGEX, "Sweety@sai7"));

	}

}
