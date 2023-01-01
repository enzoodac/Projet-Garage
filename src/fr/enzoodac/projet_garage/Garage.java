package fr.enzoodac.projet_garage;

import java.util.HashSet;
import java.util.Set;

import fr.enzoodac.projet_garage.personne.Client;
import fr.enzoodac.projet_garage.personne.Personnel;
import fr.enzoodac.projet_garage.stock.Consommables;

public class Garage {
	private String nom;
	private int budget;
	private Client[] client;
	private Set<Client> clients = new HashSet<>();
	private Set<Personnel> personnel = new HashSet<>();

	private Consommables[] consommables;

	public Garage(String nom, int budget) {
		super();
		this.nom = nom;
		
	}

	public void ajouterPersonnel(Personnel personnel) {
		this.personnel.add(personnel);
	}
	
	public void supprimerPersonnel(Personnel personnel) {
		this.personnel.add(personnel);
	}

	public void ajouterClient(Client client) {
		clients.add(client);

	}

	public void supprimerClient(Client client) {
		clients.remove(client);

	}

	public void citerClients() {

		for (Client s : clients)
			System.out.println(s.getNom());
	}
	public void citerPersonnel() {

		for (Personnel e : personnel)
			System.out.println(e);
	}

	public static void main(String[] args) {
		Garage test = new Garage("test", 30000);
		Client enzo = new Client("da cunha", "enzo", "0652592615", 3000, "iolijg@rfg.fr");
		Client client = new Client("client", "test", "0652326524", 1500, "enzodac@live.fr");
		test.ajouterClient(client);
		test.ajouterClient(enzo);
		
		test.citerClients();
		

	}

}
