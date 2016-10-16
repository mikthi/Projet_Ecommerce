package fr.adaming.dao;

import javax.ejb.Stateless;

import fr.adaming.model.Categorie;
import fr.adaming.model.Produit;

@Stateless
public class GestionnaireDaoImpl implements IConsulterDao, IEditerDao {

	@Override
	public void SeConnecter(String login, String mdp) {
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
	public void ajouterProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consulterLesProduitsParCategorie(Categorie c) {
		// TODO Auto-generated method stub
		
	}

}
