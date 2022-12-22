package personnes;

public class Humain {

	private String nom;
	private String prenom;
	private String telephone;

	public Humain(String nom, String prenom, String telephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}

	public String getNom() {
		return nom;
	}
	
//	public void verifNum(String telephone) {
//		int len = length.telephone;
//	}

	public String getPrenom() {
		return prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public static void main(String[] args) {

	}

}
