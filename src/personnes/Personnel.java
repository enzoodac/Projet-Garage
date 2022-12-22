package personnes;

public class Personnel extends Humain {

	private Poste[] poste = new Poste[1];

	public Personnel(String nom, String prenom, String telephone, Poste poste) {
		super(nom, prenom, telephone);

	}
	public Poste[] getPoste() {
		return poste;
		
		
	}
	
	
	

	public static void main(String[] args) {
		Personnel enzo = new Personnel("DA CUNHA", "Enzo", "0652592615", Poste.SECRETAIRE);
		System.out.println(enzo.getPoste());

	}
}
