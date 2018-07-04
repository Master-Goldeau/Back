package fr.parisbackgammon.webservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.parisbackgammon.model.Adherent;
import fr.parisbackgammon.spring.service.AdherentService;

@RestController
@RequestMapping("/api/adherent")
public class AdherentWebServiceRest {

	@Autowired
	private AdherentService adherentService;
//	private static logger LOGGER = LoggerFactory.getLogger(AdherentWebServiceRest.class);
	
	@PostMapping(value = "/Adherent", produces = "application/json")
	public Adherent create(@RequestBody Adherent adherent) {
		return this.adherentService.create(adherent);
	}
	
}
