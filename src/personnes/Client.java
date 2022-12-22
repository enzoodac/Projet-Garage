package personnes;
import vehicules.Voiture;

public class Client extends Humain {

	private int budget = 0;
	private String mail;
	private Voiture voiture;

	public Client(String nom, String prenom, String telephone, int budget, String mail) {
		super(nom, prenom, telephone);
		this.budget = budget;
		this.mail = mail;
	}

}
