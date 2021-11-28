package serie6_ex3;

public class Table extends Furniture {

	private double area;

	
	public Table(Material material, double pricePerHour, double workedHours, double area) {
		super(material, pricePerHour, workedHours);
		this.area = area;
	}

	

	public double totalPrice() {
		double price = this.calculateEffort() + (material.materialCost() * area);
		return price;
		
	}
}
