package com.java.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class PreviousGreaterStack {

	
	public static void main(String args[]) {
		
		//Find the previous greater element in a list of data on the left side
		
		int arr[] = {3,6,3,2,5,9,10,3,4,5,9,44};
		int res=0;
		
		
		Deque<Integer> stack=new ArrayDeque<Integer>();
		
		stack.push(arr[0]);	
		res=arr[0];
		System.out.println("Previous greater element for " +arr[0]+"is "+res+" ");
		
		for(int x=1;x<arr.length;x++) {
			
			while(stack.isEmpty()==false && stack.peek() < arr[x]) {
				
				stack.pop();
			}
			
			res = (stack.isEmpty()) ? arr[x] : stack.peek();
			
			System.out.println("Previous greater element for " +arr[x]+"is "+res+" ");
			stack.push(arr[x]);
			
			
			
			
			
			
			
			
		}
		
		
	}
	
}
