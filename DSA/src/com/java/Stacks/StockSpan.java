package com.java.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		            
		int arr[] = {26,15,14,12,16,8,6,4,30};
		int span=0;
		
		Deque<Integer> stack=new ArrayDeque<Integer>();
		stack.push(0);
		span=1;
		System.out.println(span+" ");
		
		for(int x=1 ; x<arr.length;x++) {
			
			while(stack.isEmpty() == false && arr[stack.peek()] < arr[x]) {
				
				stack.pop();
			}
			
			span = (stack.isEmpty()) ? (x+1) : x-stack.peek();
			System.out.println(span + " ");
			stack.push(x);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
