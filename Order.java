package serie6;

import java.util.ArrayList;

public class Order {
	
	protected int id;
	protected String customerName;
	protected String customerAddress;
	protected static int count = 1;
	ArrayList<Book> books = new ArrayList<Book>();
	
	public Order() {
		this.id = count;
		count++;
	}
	
	public void addBook(Book book){
		books.add(book);
		
	}
	
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	
	
	public void setCustomerAddress(String adress) {
		this.customerAddress = adress;
	}
	
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	
	
	
	public String toString() {
		return "Order id: " + this.id + ", Custumer: " + this.getCustomerName() + ", Adress : " + this.getCustomerAddress()
				+ "\n" + books.toString();
		
		}
	}
