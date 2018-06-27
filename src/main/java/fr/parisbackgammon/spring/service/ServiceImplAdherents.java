package fr.parisbackgammon.spring.service;

import java.sql.Date;

//import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.parisbackgammon.dao.CrudAdherentsDAO;
import fr.parisbackgammon.model.Adherent;
import fr.parisbackgammon.model.Adresse;
import fr.parisbackgammon.model.Offre;

/**
 * Classe d'implémentation de l'interface Service sur les adhérents.
 * 
 * @version 
 * @author Etienne Savary
 *
 */

@Service("service")
public class ServiceImplAdherents implements IServicesAdherents {

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceImplAdherents.class);

	@Autowired
	private CrudAdherentsDAO crudAdherentsDao;
		

	public ServiceImplAdherents() {
		super();
		// TODO Auto-generated constructor stub
	}


	// Ajouter des clients à la Base de Données.
//	@PostConstruct

	
	// Getter et Setter
	public CrudAdherentsDAO getCrudAdherentsDao() {
		return crudAdherentsDao;
	}
	
	public void setCrudAdherentsDao(CrudAdherentsDAO crudAdherentsDao) {
		this.crudAdherentsDao = crudAdherentsDao;
	}
	
	
	// Méthodes


	@Override
	public void persistAdherent(Adherent a) {
		LOGGER.info("Persistance d'un nouvel adh�rent");
		crudAdherentsDao.save(a);

	}

}
