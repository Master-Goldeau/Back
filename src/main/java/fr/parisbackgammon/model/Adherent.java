package fr.parisbackgammon.model;

import fr.parisbackgammon.model.Entity;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * Classe fille
 * 
 * @version
 * @author Etienne Savary
 *
 */
@Component("adherent")
@javax.persistence.Entity
@Embeddable
@DiscriminatorValue("ADHERENT")
public class Adherent extends Personne implements Entity {
	
	@Column(name="Adherent_ID", unique=true)
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long numeroAdherent;

	private Date dateNaissance;
	private String email;
	private String telephone;
	
	@OneToOne(optional = false)
	@JoinColumn(name="ADRESSE_ID", referencedColumnName="adresseId")
	private Adresse adresse;
	
	private int id;
	
//	private Offre offre;
	private boolean ffbg;

	// Constructeurs

	public Adherent() {
	}

	public Adherent(long numeroAdherent, String nom, String prenom, Date dateNaissance, String email, String telephone,
			Adresse adresse, boolean ffbg) {
		super();
		this.numeroAdherent = numeroAdherent;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.ffbg = ffbg;
	}

	
	// getter & Setters
	
	public long getNumeroAdherent() {
		return numeroAdherent;
	}

	public void setNumeroAdherent(long numeroAdherent) {
		this.numeroAdherent = numeroAdherent;
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

//	public Offre getOffre() {
//		return offre;
//	}
//
//	public void setOffre(Offre offre) {
//		this.offre = offre;
//	}

	public boolean isFfbg() {
		return ffbg;
	}

	public void setFfbg(boolean ffbg) {
		this.ffbg = ffbg;
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
		
	}

		

}
