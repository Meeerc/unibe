package serie6_ex3;

public enum Material {

	EICHE(10), BUCHE(20), ESCHE(30);

	private int materialCost;

	Material(int materialCost) {
		this.materialCost = materialCost;
	}

	public double materialCost() {
		return materialCost;
	}

	
}
