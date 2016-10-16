package fr.adaming.dao;

import javax.ejb.Local;

import fr.adaming.model.Categorie;
import fr.adaming.model.Produit;

@Local
public interface IEditerDao {
	public void ajouterProduit(Produit p);
	public void modifierProduit(Produit p);
	public void supprimerProduit(Produit p);
	public void ajouterCategorie(Categorie c);
	public void modifierCategorie(Categorie c);
	public void supprimerCategorie(Categorie c);
	public void SeConnecter(String login, String mdp);
}
