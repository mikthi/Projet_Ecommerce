package fr.adaming.managedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

import fr.adaming.model.Panier;
import fr.adaming.model.Produit;

@ManagedBean(name = "clientSession")
public class SessionClientManagedBean implements Serializable {

	/**
	* Attirbuts
	*/
	private static final long serialVersionUID = 1L;
	Panier panier;

	public void ajouterProduituPanier(Produit p) {
		// à mettre dans la classe panier
	}

	public void supprimerProduitAuPanier(Produit p) {
		// à mettre dans la classe panier
	}
}
