package com.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String[] args)throws IOException {
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Course name");
		String name=br.readLine();
		Fees f=CourseFees.getFees(name);
		System.out.println("The fees is Rs.   "+f.showFees());
	}
}
