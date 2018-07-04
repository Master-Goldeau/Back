package fr.parisbackgammon.spring.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import fr.parisbackgammon.model.Adherent;
import fr.parisbackgammon.spring.config.ApplicationConfig;
import fr.parisbackgammon.spring.service.AdherentService;


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
	@Autowired
	private AdherentService adherentService;
	
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);

//		CRUDADHERENTSDAO.SETCRUDADHERENTSDAO(DAO);
	}

	/**
	 * Méthode persistAdherent_should_add_1_Adherent() permet de tester la méthode
	 * persistAdherent() du service client
	 */

	@Test
	public void persistAdherent_Should_add_1_Adherent() {
		Adherent a = new Adherent();
//		a.setAdherentId(1);
//		crudAdherentsDao.persistAdherent(a);
		adherentService.create(a);
	}
}
