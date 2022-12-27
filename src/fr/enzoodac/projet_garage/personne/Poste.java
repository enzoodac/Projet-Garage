package fr.enzoodac.projet_garage.personne;

public enum Poste {
	SECRETAIRE("secrétaire"), MECANCIEN("mécanicien"), CHEF_ATELIER("chef d'atelier"), STAGIAIRE("stagiaire"),
	COMMERCIAL("commercial"), PREPARATEUR_VO("préparateur VO");

	private String nom;

	private Poste(String nom) {
		this.nom = nom;
	}

	public String toString() {
		return nom;
	}
//	public static void main(String[] args) {
//		System.out.println("Les différents postes du garage sont : ");
//		for(Poste poste : Poste.values()) {
//			System.out.println("- " + poste);
//		}
}
