package com.nt.main;

import com.nt.service.ArithematicApp;

public class ApplicationTest {

	public static void main(String[] args) 
	{
		ArithematicApp ar=new ArithematicApp();
		int sum1=ar.sum(10, 20);
		System.out.println(sum1);
		
	}

}
