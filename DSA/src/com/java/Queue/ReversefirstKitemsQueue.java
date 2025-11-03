package com.java.Queue;

public class ReversefirstKitemsQueue {

	
	
	public static void main(String args[]) {
		
		
		
		/*Given an integer k and a queue of integers, we need to reverse the order of the first k elements of the queue, 
		 * leaving the other elements in the same relative order.

Only following standard operations are allowed on queue.

enqueue(x) : Add an item x to rear of queue
dequeue() : Remove an item from front of queue
size() : Returns number of elements in queue.
front() : Finds front item.

"If the size of queue is smaller than the given k , then return the original queue."

*/
		
	}
	public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        int size = q.size();
        if(k > size){
            return q;
        }
        // current q = 1 2 3 4 5
        reverseFirstKQueue(q,1,k);
        // q= 4 5 3 2 1
        
        //now we have to shift the elements
        rem = size - k;
        
        for(int x = 1;x <= rem ; x++){
            q.offer(q.poll());
        }
        
        return q;
    }
    
    public static void reverseFirstKQueue(Queue<Integer> q, int current, int k){
        
        if(q.isEmpty()==true || current > k){
            return;
        }
        

        int x= q.peek();
        q.poll();
        reverseFirstKQueue(q,current+1,k);
        q.offer(x); 

    }
	

	
	
	
}
