package stock;

public class Consommables {

	private String nom;
	private int prix;
	private int stockActuel;
	private int stockMin;

	public void gestionStock(int stockActuel, int stockMin, String nom) {
		if (stockActuel < stockMin) {
			reStock( stockActuel, stockMin, nom);
		}
	}

	public void reStock(int stockActuel, int stockMin, String nom) {
		while (stockActuel < stockMin) {
			stockActuel++;
		}

	}

}
