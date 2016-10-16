package fr.adaming.service;

import java.io.Serializable;

import javax.ejb.Stateful;

import fr.adaming.model.Categorie;
import fr.adaming.model.Client;
import fr.adaming.model.Panier;

@Stateful
public class ClientServiceImpl implements ICommanderService, IConsulterService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void consulterCommande(int id_commande) {
		// TODO Auto-generated method stub

	}

	@Override
	public void consulterTousLesProduits() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consulterToutesLesCategories() {
		// TODO Auto-generated method stub

	}

	@Override
	public void consulterProduitSelectionne(int id_produit) {
		// TODO Auto-generated method stub

	}

	@Override
	public void chercherProduitsParMotCle(String s) {
		// TODO Auto-generated method stub

	}

	@Override
	public void consulterLesProduitsParCategorie(Categorie c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enregistrerClient(Client cl) {
		// TODO Auto-generated method stub

	}

	@Override
	public void passerCommande(Panier panier) {
		// TODO Auto-generated method stub

	}

}
