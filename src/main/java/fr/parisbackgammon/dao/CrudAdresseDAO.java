package fr.parisbackgammon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.parisbackgammon.model.*;

public interface CrudAdresseDAO extends JpaRepository<Adresse, Integer>{

}
