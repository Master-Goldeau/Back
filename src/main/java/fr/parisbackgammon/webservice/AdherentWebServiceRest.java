package fr.parisbackgammon.webservice;


import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.parisbackgammon.model.Adherent;
import fr.parisbackgammon.spring.service.AdherentService;

@RestController
@RequestMapping("/api/adherent")
public class AdherentWebServiceRest {

	@Autowired
	AdherentService adherentService;
//	private static logger LOGGER = LoggerFactory.getLogger(AdherentWebServiceRest.class);
	
	@PostMapping(value = "/adherent", produces = "application/json")
	public Adherent create(@RequestBody Adherent adherent) {
		return this.adherentService.create(adherent);
	}
	
//	@PostMapping(value = "/adherent", produces = "application/json")
//	public Adherent create(@RequestBody Adherent adherent) {
//		try{
//			this.adherentService.create(adherent);
//			return new ResponseEntity<>(HttpStatus.OK);
//		}catch (ServiceException e) {
//			LOGGER.warn("exeption thrown", e);
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//	}
	
	@GetMapping({""})
	public List<Adherent> readAll() {
		return this.adherentService.getList();
	}
	
	@GetMapping("/{id}")
	public Adherent readMe(@PathVariable Integer id) {
		return this.adherentService.read(id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(code=HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		this.adherentService.delete(id);
	}
	
	@PutMapping("/{id}")
	public Adherent update(@RequestBody Adherent adherent) {
		return adherentService.edit(adherent);
			
	}
	
}
