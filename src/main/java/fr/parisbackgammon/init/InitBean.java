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
		
		Adherent Adherent1 = new Adherent(654,"Guillard","Ibrahima",LocalDate.now(),"guillard@gmail.com","064585456321",ad654654,true);
		crudServiceAdherent.create(Adherent1);

		ad654654.setAdherent(Adherent1);
		ad654654.setCodepostal("92654");
		ad654654.setNumeroDeRue(29);
		ad654654.setVille("RomainVille");
		ad654654.setVoie("rue des joueurs");
		crudServiceAdresse.edit(ad654654);
		
		Adherent1.setAdresse(ad654654);
		crudServiceAdherent.edit(Adherent1);
				
		System.out.println(Adherent1);
		
		System.out.println(Adherent1.getEmail());
	}

}
