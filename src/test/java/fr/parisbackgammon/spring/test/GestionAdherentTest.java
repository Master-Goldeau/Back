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

// /**
// * M�thode editClient_Should_edit_A_Client() permet de tester la m�thode
// * editClient() du service client
// */
//
// @Test
// public void editClient_Should_edit_A_Client() {
// Client client = new Client("julie", "juju", "05020254032", "rue de la fi",
// "ville", "01225");
// client.setId(1L);
// when(dao.findOne(1L)).thenReturn(client);
// Client client1 = Gcl.editClient(1L);
// assertEquals(client, client1);
// }
//
// /**
// * M�thode deleteClient_Should_add_A_Client() permet de tester la m�thode
// * deleteClient() du service client
// */
//
// @Test
// public void deleteClient_Should_delete_A_Client() {
// Client client = new Client("julie", "juju", "05020254032", "rue de la fi",
// "ville", "01225");
// Gcl.deleteClient(client.getId());
// }
//
// /**
// * M�thode updateClient_Should_add_A_Client() permet de tester la m�thode
// * deleteClient() du service client
// */
//
// @Test
// public void updateClient_Should_update_A_Client() {
// Client client = new Client("julie", "juju", "05020254032", "rue de la fi",
// "ville", "01225");
// client.setPrenom("Camille");
// Gcl.updateClient(client);
// }
//
// /**
// * M�thode listClient_Should_list_A_Client() permet de tester la m�thode
// * listClient() du service client
// */
//
// @Test
// public void listClient_Should_list_A_Client() {
// Client client1 = new Client("julie", "juju", "05020254032", "rue de la fi",
// "ville", "01225");
// Client client2 = new Client("julie", "camille", "05020254032", "rue de la
// fi", "ville", "01225");
// List<Client> listClients = new ArrayList<>();
// listClients.add(client1);
// listClients.add(client2);
// Gcl.listClients();
// }
//
// }
