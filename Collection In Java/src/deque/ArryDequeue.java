package deque;

import java.util.ArrayDeque;

import bookPriorityQueue.Book;

public class ArryDequeue {

	public static void main(String[] args) {

		ArrayDeque<Book> adq = new ArrayDeque<>();

		adq.add(new Book(1, "secret", 1000));
		adq.add(new Book(2, "hamlet", 940));
		adq.add(new Book(3, "power of mind", 480));
		adq.add(new Book(4, "life", 800));
		adq.add(new Book(5, "success", 1200));

		for (Book b : adq) {
			System.out.println(b);
		}
		System.out.println("-------------------------------------------");
		System.out.println(adq.removeLast());
		for (Book b : adq) {
			System.out.println(b);
		}
		System.out.println("-------------------------------------------");
		System.out.println(adq.removeFirst());
		for (Book b : adq) {
			System.out.println(b);
		}
		System.out.println("-------------------------------------------");
		System.out.println(adq.removeLast());
		for (Book b : adq) {
			System.out.println(b);
		}
	}

}
