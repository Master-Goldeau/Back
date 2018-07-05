package fr.parisbackgammon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Embeddable
@Entity
public class Adresse implements Serializable, Model{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="adresseId")
	private int adresseId;

	@OneToOne(mappedBy="adresse")
	private Adherent adherent;
	private int numeroDeRue;
	private String voie;
	private String codepostal;
	private String ville;
	
	
	public long getAdherentID(Adherent adherent) {
		return adherent.getAdherentId();
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



	@Override
	public Integer getId() {
		return (int) adresseId;
	}



	@Override
	public void setId(Integer id) {
		// TODO Auto-generated method stub
		this.adresseId = id;
	}



	public long getAdresseId() {
		return adresseId;
	}



	public void setAdresseId(Integer adresseId) {
		this.adresseId = adresseId;
	}






}


