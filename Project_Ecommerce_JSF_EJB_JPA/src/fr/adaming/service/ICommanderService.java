package fr.adaming.service;

import javax.ejb.Local;

import fr.adaming.model.Client;
import fr.adaming.model.Panier;

@Local
public interface ICommanderService {

	public void enregistrerClient(Client cl);

	public void passerCommande(Panier panier);
}
