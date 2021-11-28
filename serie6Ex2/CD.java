package serie6Ex2;

public class CD implements IArticle {
	
	private int id;
	private int price;
	private int year;
	private String interpret;
	private String title;
	
	public CD(int id, String title, String interpret, int year, int price) {
		this.id = id;
		this.price = price;
		this.title = title;
		this.year = year;
		
	}
	
	public int getId() {
		
		return id;
	}

	
	public int getPrice() {
		
		return this.price;
	}

	
	public String getDescription() {
		return id + " (CD) " + title + ", by " + interpret +
				", " + year + ", " + price + " CHF";
	}

}
