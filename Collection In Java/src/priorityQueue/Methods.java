package priorityQueue;

import java.util.PriorityQueue;

public class Methods {

	public static void main(String[] args) {

		PriorityQueue<Integer> pq=new PriorityQueue<>();
		System.out.println(pq.remove(pq));
		System.out.println(pq.poll());
		pq.add(45);
		pq.add(785);
		pq.add(98);
		pq.add(405);
		pq.add(6);
		pq.add(32);
		pq.add(18);
		pq.add(48);
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq);
System.out.println(pq.element());
System.out.println(pq.peek());
	}

}
