package com.java.Stacks;

import java.lang.annotation.ElementType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.stream.IntStream;

public class NextGreaterElementStack {
	public static void main(String args[]) {
		
		int arr[] = {3,6,3,2,5,9,10,3,4,5,9,44};
		int ans =0;
		Deque<Integer> stack = new ArrayDeque<Integer>();
		
		stack.push(arr[arr.length-1]);
		
		System.err.println("Next greater element for "+arr[arr.length-1]+" is "+arr[arr.length-1]);
		
		
		for (int x=arr.length-2; x>=0; x--) {
			
			while(stack.isEmpty()==false && stack.peek()<arr[x]) {
				stack.pop();
			}
			
			ans = (stack.isEmpty()) ? arr[x] : stack.peek();
			stack.push(arr[x]);
			System.err.println("Next greater element for "+arr[x]+" is "+ans);
			
			
		}
		
		
		
		
	}

	
	
	
	
}
