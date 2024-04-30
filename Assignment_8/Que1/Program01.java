package com.tester;

import com.entities.StringCheker;

import custom.exception.ExceptionLineToolLong;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCheker s1=new StringCheker();
		try {
		s1.calculateStringLength();
		}catch(ExceptionLineToolLong e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Inside finally block");
		}
	}

}
