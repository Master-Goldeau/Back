package fr.parisbackgammon.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import fr.parisbackgammon.dao.CrudAdherentsDAO;
import fr.parisbackgammon.model.*;
import fr.parisbackgammon.spring.config.ApplicationConfig;
import fr.parisbackgammon.spring.service.ServiceImplAdherents;





/**
 * Test Unitaire Mockito sur la Gestion des clients de Proxibanque.
 * 
 * @version ParisBackammon
 * @author Etienne Savary
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfig.class})
@WebAppConfiguration
@Component("fr.parisbackgammon.spring.test.GestionAdherentTest")
public class GestionAdherentTest {

	@Mock
	CrudAdherentsDAO dao;

	private ServiceImplAdherents crudAdherentsDao= new ServiceImplAdherents();
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
//		crudAdherentsDao.setCrudAdherentsDao(dao);
		crudAdherentsDao.setCrudAdherentsDao(dao);
		
	}

	/**
	 * Méthode persistAdherent_should_add_1_Adherent() permet de tester la méthode
	 * persistAdherent() du service client
	 */

	@Test
	public void persistAdherent_Should_add_1_Adherent() {
		Adherent a = new Adherent();
		crudAdherentsDao.persistAdherent(a);
	}
}
