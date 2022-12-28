package fr.enzoodac.projet_garage;

import fr.enzoodac.projet_garage.personne.Personnel;
import fr.enzoodac.projet_garage.personne.Client;
import fr.enzoodac.projet_garage.stock.Consommables;

public class Garage {
	private String nom;
	private int nbPersonnel = 0;
	private int nbClient = 0;
	private Personnel[] personnel;
	private Client[] client;
	private Consommables[] consommables;

	public Garage(String nom, int nbPersonnelMax, int nbClientMax) {
		super();
		this.nom = nom;
		client = new Client[nbClientMax];
		personnel = new Personnel[nbPersonnelMax];
	}

	public void ajouterPersonnel(Personnel personnel) {
		if (nbPersonnel < this.personnel.length) {
			this.personnel[nbPersonnel] = personnel;
			nbPersonnel++;
		}

	}

}
