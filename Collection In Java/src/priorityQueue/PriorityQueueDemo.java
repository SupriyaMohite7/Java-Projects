package priorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq =new PriorityQueue<>();
		
		pq.add(75);
		pq.add(50);
		pq.add(78);
		pq.add(2);
		pq.add(100);
		pq.add(96);
		pq.add(21);
		System.out.println(pq);
	}

}
