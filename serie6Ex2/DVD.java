package serie6Ex2;

public class DVD implements IArticle {
	
	private int id;
	private int price;
	private int year;
	private String title;

	public DVD( int id, String title, int year, int price ) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.price = price;
	}
	
	public int getId() {
		return this.id;
	}

	
	public int getPrice() {
		return this.price;
	}

	
	public String getDescription() {
		return  id + " (DVD) " + title  +
				", " + year + ", " + price + " CHF";
	}

}
