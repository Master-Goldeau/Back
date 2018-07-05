package fr.parisbackgammon.init;

import java.time.LocalDate;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.parisbackgammon.model.Adherent;
import fr.parisbackgammon.model.Adresse;
import fr.parisbackgammon.spring.service.AdherentService;
import fr.parisbackgammon.spring.service.AdresseService;


@Component
public class InitBean implements InitializingBean {

	@Autowired
	AdherentService crudServiceAdherent;
	
	@Autowired
	AdresseService crudServiceAdresse;

	@Override
	public void afterPropertiesSet() throws Exception {
		// Adherent 1 & adresse1
		Adresse ad654654 = new Adresse();
		crudServiceAdresse.create(ad654654);
		
//			
//		LocalDate localDate;
//		
//		LocalDate birthdate = new LocalDate (1970, 1, 20);
		
		Adherent Adherent1 = new Adherent("iguillard", "password", "Guillard", "Ibrahima", LocalDate.of(2001, 5, 8), "guillard@gmail.com", "0674010687", ad654654, true);
		crudServiceAdherent.create(Adherent1);

		ad654654.setAdherent(Adherent1);
		ad654654.setCodepostal("92654");
		ad654654.setNumeroDeRue(29);
		ad654654.setVille("RomainVille");
		ad654654.setVoie("rue des joueurs");
		crudServiceAdresse.create(ad654654);
		
		Adherent1.setAdresse(ad654654);
		crudServiceAdherent.edit(Adherent1);
				
		System.out.println(Adherent1);
		
		System.out.println(Adherent1.getPrenom());
	}

}
