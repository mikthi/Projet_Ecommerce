/**
 * 
 */
package fr.adaming.model;

import java.io.Serializable;
import java.util.Map;

/**
 * @author inti0210
 *
 */
public class Panier implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<Produit, Integer> produitCommande;

}
