package com.java.Stacks;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class RecusiveFindingMiddleStackElement {

	
	
	/*Given a stack s, delete the middle element of the stack without using any additional data structure.

Middle element:- floor((size_of_stack+1)/2) (1-based indexing) from the bottom of the stack.

Note: The output shown by the compiler is the stack from top to bottom.

Examples:

Input: s = [10, 20, 30, 40, 50]
Output: [50, 40, 20, 10]
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Deque<Integer> u = new ArrayDeque<Integer>(Arrays.asList(10, 20, 30, 40, 50));
		
		findMid( u, u.size() , 0);
	
		while(u.isEmpty()==false) {
			
			System.out.println(u.peek());
			u.pop();
			
		}
		
	}

	
	public static void findMid( Deque<Integer> u,int size, int current) {
		
		if(current==size/2) {
			u.pop();
			return;
		}
		int x=u.peek();
		u.pop();

		findMid(u, size, current+1);
		
		u.push(x);
		
		
		
	}

}
