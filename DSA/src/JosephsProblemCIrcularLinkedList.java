import java.util.Iterator;
import java.util.LinkedList;

public class JosephsProblemCIrcularLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list=new LinkedList<Integer>();
		
		int p= 7;
		int k=3;
		
		for(int x=0;x<p;x++) {
			list.add(x);
		}
		
		Iterator iterator = list.iterator();
		
		while(list.size()>1) {
			int count = 0;
			while(count<k) {
				while(iterator.hasNext() && count<k) {
					iterator.next();
					count++;
				}
				if(count<k) {
					iterator=list.iterator();
					iterator.next();
					count++;
				}
			}
			iterator.remove();
		}
		System.out.println(list.getFirst());
		
	}

}
