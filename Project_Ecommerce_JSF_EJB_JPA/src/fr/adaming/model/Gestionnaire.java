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
@Table(name = "gestionnaires")
public class Gestionnaire extends Personne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_gestionnaire;
	private String password;

	/**
	 * 
	 */
	public Gestionnaire() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param password
	 */
	public Gestionnaire(String nom, String prenom, String password) {
		super(nom, prenom);
		this.password = password;
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param id_gestionnaire
	 * @param password
	 */
	public Gestionnaire(String nom, String prenom, int id_gestionnaire, String password) {
		super(nom, prenom);
		this.id_gestionnaire = id_gestionnaire;
		this.password = password;
	}

	/**
	 * @return the id_gestionnaire
	 */
	public int getId_gestionnaire() {
		return id_gestionnaire;
	}

	/**
	 * @param id_gestionnaire
	 *            the id_gestionnaire to set
	 */
	public void setId_gestionnaire(int id_gestionnaire) {
		this.id_gestionnaire = id_gestionnaire;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Redéfinition de toString
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Gestionnaire [id_gestionnaire=" + id_gestionnaire + ", password=" + password + ", getNom()=" + getNom()
				+ ", getPrenom()=" + getPrenom() + "]";
	}

}
