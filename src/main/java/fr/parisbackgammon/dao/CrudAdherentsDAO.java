package fr.parisbackgammon.dao;

import fr.parisbackgammon.model.*;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Cette interface permet de persister les nouvelles personnes dans la base de
 * donn�es
 * 
 * @version ParisBackgammon VJava8
 * @author Etienne Savary
 **/

public interface CrudAdherentsDAO extends JpaRepository<Adherent, Integer> {

}
