package fr.parisbackgammon.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.parisbackgammon.model.Model;


public abstract class CrudService<MODEL extends Model> {

	/**
	 * Une instance de l'implémentation de ArticleRepository (générée par
	 * Spring) sera injectée en valeur de "repo" grâce à cette annotation.
	 */
	@Autowired
	protected JpaRepository<MODEL, Integer> repo;

	/**
	 * Fonction permettant de factoriser les appels à repo.save(..).
	 * 
	 * @param model l'article à persister pour création ou mise à jour.
	 * @return Article l'article modifié et validé par la BDD.
	 */
	protected MODEL save(MODEL model) {
		return this.repo.save(model);
	}

	/**
	 * Créer et enregister un nouvel article.
	 * 
	 * @param title le titre du nouvel article.
	 * @param description sa description associée.
	 * @return Article l'article créé avec son identifiant rempli.
	 */
	public MODEL create(MODEL model) {
		return this.save(model);
	}

	/**
	 * Récupération de la liste des article depuis la persistence.
	 * 
	 * @return List<Article> tous les articles en BDD.
	 */
	public List<MODEL> getList() {
		return this.repo.findAll();
	}

	public MODEL read(Integer id) {
		MODEL result = null;
		final Optional<MODEL> wrapper = this.repo.findById(id);
		if (wrapper.isPresent()) {
			result = wrapper.get();
		}
		return result;
	}

	/**
	 * Supprime un article.
	 * 
	 * @param id l'identifiant de l'article à supprimer.
	 */
	public void delete(Integer id) {
		this.repo.deleteById(id);
	}

	/**
	 * Mise à jour d'un article existant en BDD.
	 * 
	 * @param model l'article à mettre à jour avec id rempli.
	 * @return Article l'article mis à jour depuis la BDD.
	 */
	public MODEL edit(MODEL model) {
		if (model.getId() == null) {
			throw new IllegalArgumentException(
					"Cannot update an article without its id.");
		}
		return this.save(model);
	}

}