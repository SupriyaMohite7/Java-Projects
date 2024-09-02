package bookPriorityQueue;

public class Book {

	int id,price;
	String name;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int id, String name , int price) {
		super();
		this.id = id;
		this.price = price;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", price=" + price + ", name=" + name + "]";
	}
	
}
