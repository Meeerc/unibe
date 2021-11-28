package serie6Ex2;

import java.util.ArrayList;

public class Order {
	
	protected int id;
	protected String customerName;
	protected String customerAddress;
	protected static int count = 1;
	ArrayList<IArticle> items = new ArrayList<IArticle>();
	
	public Order() {
		this.id = count;
		count++;
	}
	public void newOrder() {
		Order o = new Order();
		
	}
	
	
	public void addItem(IArticle item){
		items.add( item);
		
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
				+ "\n" + items.toString();
		
		}
	}
