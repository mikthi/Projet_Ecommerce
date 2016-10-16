/**
 * 
 */
package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author inti0210
 *
 */
@Entity
@Table(name = "categories")
public class Categorie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_categorie;
	private String nom;
	private String description;

	/**
	 * Constructeur vide
	 */
	public Categorie() {
		super();
	}

	/**
	 * Constructeur avec param�tres sans id
	 * 
	 * @param nom
	 * @param description
	 */
	public Categorie(String nom, String description) {
		super();
		this.nom = nom;
		this.description = description;
	}

	/**
	 * Constructeur avec param�tres et id
	 * 
	 * @param id_categorie
	 * @param nom
	 * @param description
	 */
	public Categorie(int id_categorie, String nom, String description) {
		super();
		this.id_categorie = id_categorie;
		this.nom = nom;
		this.description = description;
	}

	/**
	 * Getters et Setters
	 */
	/**
	 * @return the id_categorie
	 */
	public int getId_categorie() {
		return id_categorie;
	}

	/**
	 * @param id_categorie
	 *            the id_categorie to set
	 */
	public void setId_categorie(int id_categorie) {
		this.id_categorie = id_categorie;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Red�finition de toString
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Categorie [id_categorie=" + id_categorie + ", nom=" + nom + ", description=" + description + "]";
	}

}
