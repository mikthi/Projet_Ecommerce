package fr.adaming.dao;

import javax.ejb.Local;

import fr.adaming.model.Categorie;

@Local
public interface IConsulterDao {
	public void consulterCommande(int id_commande);
	public void consulterTousLesProduits();
	public void consulterToutesLesCategories();
	public void consulterLesProduitsParCategorie(Categorie c);
	public void consulterProduitSelectionne(int id_produit);
	public void chercherProduitsParMotCle(String s);
	

}
