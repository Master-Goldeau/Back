package fr.parisbackgammon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Adresse implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="adresseid")
	private long adresseId;

	@OneToOne(mappedBy="adresse")
	@Embedded
	private Adherent adherent;
	private int numeroDeRue;
	private String voie;
	private String codepostal;
	private String ville;
	
	
	public long getAdherentID(Adherent adherent) {
		return adherent.getNumeroAdherent();
	}
	


	public int getNumeroDeRue() {
		return numeroDeRue;
	}


	public void setNumeroDeRue(int numeroDeRue) {
		this.numeroDeRue = numeroDeRue;
	}
	public String getVoie() {
		return voie;
	}
	public void setVoie(String voie) {
		this.voie = voie;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public Adherent getAdherent() {
		return adherent;
	}


	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}






}


