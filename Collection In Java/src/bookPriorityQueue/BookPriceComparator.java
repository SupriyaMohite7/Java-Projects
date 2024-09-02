package bookPriorityQueue;

import java.util.Comparator;

import bookPriorityQueue.Book;

public class BookPriceComparator implements Comparator<Book>{
	

	@Override
	public int compare(Book o1, Book o2) {
		return o1.price-o2.price;
	}

}
