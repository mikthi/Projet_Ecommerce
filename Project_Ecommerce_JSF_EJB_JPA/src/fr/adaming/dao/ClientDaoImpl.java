package fr.adaming.dao;

import javax.ejb.Stateless;

import fr.adaming.model.Categorie;
import fr.adaming.model.Panier;

@Stateless
public class ClientDaoImpl implements ICommanderDao, IConsulterDao {

	@Override
	public void enregistrerClient() {
		// TODO Auto-generated method stub

	}

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
	public void passerCommande(Panier panier) {
		// TODO Auto-generated method stub

	}

}
