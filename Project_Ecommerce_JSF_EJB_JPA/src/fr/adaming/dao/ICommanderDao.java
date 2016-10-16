package fr.adaming.dao;

import javax.ejb.Local;

import fr.adaming.model.Panier;

@Local
public interface ICommanderDao {
	public void enregistrerClient();
	public void passerCommande(Panier panier);

}
