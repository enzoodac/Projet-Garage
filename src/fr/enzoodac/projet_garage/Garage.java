package fr.enzoodac.projet_garage;

import java.util.HashSet;
import java.util.Set;

import fr.enzoodac.projet_garage.personne.Client;
import fr.enzoodac.projet_garage.personne.Personnel;
import fr.enzoodac.projet_garage.stock.Consommables;

public class Garage {
	private String nom;
	private int nbPersonnel = 0;
	private int nbClient = 0;
	private int nbPersonnelMax;
	private int nbClientMax;
	private int budget;
	private Personnel[] personnel;
	private Client[] client;
	private Set<Client> clients = new HashSet<>(); 


	private Consommables[] consommables;

	public Garage(String nom, int nbPersonnelMax, int nbClientMax, int budget) {
		super();
		this.nom = nom;
		this.nbClient = nbClient;
		this.nbClientMax = nbClientMax;
		client = new Client[nbClientMax];
		personnel = new Personnel[nbPersonnelMax];
	}

	public void ajouterPersonnel(Personnel personnel) {
		if (nbPersonnel < this.personnel.length) {
			this.personnel[nbPersonnel] = personnel;
			nbPersonnel++;
		}
	}

	public void ajouterClient(Client client) {
		if (nbClient < this.client.length) {
			this.client[nbClient] = client;
			nbClient++;
		}

	}

	public void supprimerClient(int clientCherche) {
		Client[] nouveau = new Client[nbClientMax];
		int i = 0;
		while (i < nbClient) {
			if (i != clientCherche) {
				nouveau[i] = client[i];
				i++;
			}

		}

		nbClient--;
		client = nouveau;

	}

	public int trouverIndiceClient(String prenom, String nom) {
		int i = 0;

		while (i < nbClient && this.client[i].getNom() != nom && this.client[i].getPrenom() != prenom) {
			i++;
		}
		return i;
	}

	public void citerClients() {
		for (int i = 0; i < nbClient; i++) {
			System.out.println(client[i].getPrenom());
		}
	}

	public static void main(String[] args) {
		Garage test = new Garage("test", 4, 3, 10000);
		Client enzo = new Client("da cunha", "enzo", "0652592615", 3000, "iolijg@rfg.fr");
		Client client = new Client("client", "test", "0652326524", 1500, "enzodac@live.fr");
		test.ajouterClient(client);
		test.ajouterClient(enzo);

		test.citerClients();
		System.out.println(test.nbClient);
		test.supprimerClient(1);
		System.out.println(test.nbClient);
		test.citerClients();

	}

}
