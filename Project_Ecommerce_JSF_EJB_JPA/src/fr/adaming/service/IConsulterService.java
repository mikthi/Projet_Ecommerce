package fr.adaming.service;

import javax.ejb.Local;

import fr.adaming.model.Categorie;

@Local
public interface IConsulterService {

	public void consulterCommande(int id_commande);

	public void consulterTousLesProduits();

	public void consulterToutesLesCategories();

	public void consulterLesProduitsParCategorie(Categorie c);

	public void consulterProduitSelectionne(int id_produit);

	public void chercherProduitsParMotCle(String s);

}
