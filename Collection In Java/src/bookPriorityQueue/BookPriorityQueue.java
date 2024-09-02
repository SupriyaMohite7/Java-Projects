package bookPriorityQueue;

import java.util.PriorityQueue;

public class BookPriorityQueue {

	public static void main(String[] args) {

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
	}

}
