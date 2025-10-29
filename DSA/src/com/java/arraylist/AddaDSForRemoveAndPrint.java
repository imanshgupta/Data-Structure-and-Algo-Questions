package com.java.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class AddaDSForRemoveAndPrint {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
		String choice = bReader.readLine();
		
		ArrayList<Integer> aList=new ArrayList<Integer>();
		switch(choice) {
		
		case "1": System.out.println("Enter a number ");
					int x = bReader.read();
						aList.add(x);
						break;
						
		case "2": System.out.println("Enter a number to remove");
					int r = bReader.read();	
						Iterator<>
		
		}
		
		
	}

}
