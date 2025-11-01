package com.java.Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ShopkeepersProfit {
/*
 * Ram makes a plan for the new year. 
 * He decides to sell the products and writes down the price for n days.
 *  The prices are denoted by an array arr[] of n elements.
 *   Looking at the sequence he decides that for the ith product,
 *    he is going to get a profit that equals to (arr j - arr i), 
 *    
 *    where j is the minimum index 
 *    just greater than i and arr j >= arr i. 
 *    
 *    If there is no such j, 
 *    then his profit will be equal to arri. Find the total profit of Ram. 
 *    
 *    conditions 
 *    if there is a greater element to the right then the profit will be (arr j - arr i), 
 *    if there is no such element then the element itself is the profit 
 *    

Calculate profit for all the products.
Examples:
Input: arr[] = [5, 4, 6, 2, 1]

Output: 12
Explanation: For the above test case, since  
there are no elements to the right of 6 , 2 , and 1 which are greater than them, 
they are added to the answer which is now 6 + 2 + 1 = 9. 
Further more, for 5 and 4, 6 is greater than both of them which 
adds (6 - 5) and (6 - 4) to the answer and makes it 9 + 1 + 2 = 12.

*/
	
	public static void main() {
		
		int arr[]= {5, 4, 6, 2, 1};
		
		Deque<Integer> queue= new ArrayDeque<Integer>();
		
		int profit=arr[arr.length-1];
		queue.push(profit);
		for(int x=arr.length-2; x>=0; x--){
			
			
			while(queue.isEmpty()==false && queue.peek() < arr[x])
			{
				queue.pop();
			}
			
			profit = profit +((queue.isEmpty()) ? arr[x]: queue.peek()-arr[x] );
			queue.push(arr[x]);
			
		}
		
		
		
		System.out.println(profit);
		
		
	}
	
	
	
}






