package stock;

public class Consommables {

	private String nom;
	private int prix;
	private int budgetGarage;
	private int stockActuel;
	private int stockMin;

	public Consommables(String nom, int prix, int stockActuel, int stockMin) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.stockActuel = stockActuel;
		this.stockMin = stockMin;
	}

	public void gestionStock(int stockActuel, int stockMin, String nom, int prix) {
		if (stockActuel < stockMin && budgetGarage > prix) {
			while (stockActuel < stockMin) {
				stockActuel++;
				budgetGarage -= prix;
			}
		}
	}

	

}
