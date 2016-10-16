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
@Table(name = "clients")
public class Client extends Personne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_client;
	private String mail;
	private String telephone;

	/**
	 * Constructeur vide
	 */
	public Client() {
		super();
	}

	/**
	 * Constructeur avec param�tres sans id
	 * 
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param telephone
	 */
	public Client(String nom, String prenom, String mail, String telephone) {
		super(nom, prenom);
		this.mail = mail;
		this.telephone = telephone;
	}

	/**
	 * Constructeur avec param�tres et id
	 * 
	 * @param nom
	 * @param prenom
	 * @param id_client
	 * @param mail
	 * @param telephone
	 */
	public Client(String nom, String prenom, int id_client, String mail, String telephone) {
		super(nom, prenom);
		this.id_client = id_client;
		this.mail = mail;
		this.telephone = telephone;
	}

	/**
	 * Getters et Setters
	 */
	/**
	 * @return the id_client
	 */
	public int getId_client() {
		return id_client;
	}

	/**
	 * @param id_client
	 *            the id_client to set
	 */
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone
	 *            the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
		return "Client [id_client=" + id_client + ", mail=" + mail + ", telephone=" + telephone + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + "]";
	}

}
