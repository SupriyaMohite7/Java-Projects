package deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

import bookPriorityQueue.Book;
import bookPriorityQueue.BookPriceComparator;




public class Assignment1 {

	public static void main(String[] args) {
/*
 * 1.	WAP to create a Queue with Integer objects without using generics
 */
		PriorityQueue p1 = new PriorityQueue<>();
		p1.add(10);
		p1.add(20);
		p1.offer(30);
		p1.offer(40);
		
		System.out.println(p1);
		System.out.println("=============================================");
	
/*
 * 2.	WAP to create a Queue with some colors (String) &amp; using generics	
 */

		PriorityQueue p2 = new PriorityQueue<>();
		p2.add("Red");
		p2.add("Yellow");
		p2.add("Blue");
		p2.add("Green");
		
		System.out.println(p2);
		System.out.println("=============================================");
		
/*
 * 3.	WAP to create a Queue with user defined class objects &amp; using generics
 */

		ArrayDeque<Book> adq = new ArrayDeque<>();

		adq.add(new Book(1, "secret", 1000));
		adq.add(new Book(2, "hamlet", 940));
		adq.add(new Book(3, "power of mind", 480));
		adq.add(new Book(4, "life", 800));
		adq.add(new Book(5, "success", 1200));
		
		for(Book b:adq)
		{
			System.out.println(b);
		}
		System.out.println("=============================================");

		
/*
 * 4.	Use 2 different method calls to add elements to a queue.
 */
		p1.add(50);
		p1.offer(60);
		
		System.out.println(p1);
		System.out.println("=============================================");
		
/*
 * 		5.	WAP to check if a queue has values
 */
		System.out.println(p1.contains(50));
		System.out.println("=============================================");

/*
 * 9.	WAP to create a Queue using generics and add user defined class 
 * objects which implements comparable interface. Observe order when 
 * removing from queue.
 */
		PriorityQueue<Book> bpq=new PriorityQueue<>(new BookPriceComparator());
		bpq.add(new Book(1,"secret",1000));
		bpq.add(new Book(2,"hamlet",940));
		bpq.add(new Book(3,"power of mind",480));
		bpq.add(new Book(4,"life",800));
		bpq.add(new Book(5,"success",1200));

		for(Book b:bpq)
		{
			System.out.println(b);
		}
		System.out.println("=============================================");
	}

}
