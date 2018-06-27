package fr.parisbackgammon.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * Classe fille
 * 
 * @version
 * @author Etienne Savary
 *
 */
@Component("adherent")
@Entity
public class Adherent extends Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long numeroAdherent;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String email;
	private String telephone;
	private Adresse adresse;
	private Offre offre;
	private boolean ffbg;

	// Constructeurs

	public Adherent() {
	}

	public Adherent(long numeroAdherent, String nom, String prenom, Date dateNaissance, String email, String telephone,
			Adresse adresse, Offre offre, boolean ffbg) {
		super();
		this.numeroAdherent = numeroAdherent;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.offre = offre;
		this.ffbg = ffbg;
	}

	
	// getter & Setters
	
	public long getNumeroAdherent() {
		return numeroAdherent;
	}

	public void setNumeroAdherent(long numeroAdherent) {
		this.numeroAdherent = numeroAdherent;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Offre getOffre() {
		return offre;
	}

	public void setOffre(Offre offre) {
		this.offre = offre;
	}

	public boolean isFfbg() {
		return ffbg;
	}

	public void setFfbg(boolean ffbg) {
		this.ffbg = ffbg;
	}
	
	
	

}
