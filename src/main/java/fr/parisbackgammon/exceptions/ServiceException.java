package fr.parisbackgammon.exceptions;

public class ServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1936715680585496740L;

	/**
	 * Classe Exception utilisée par le service.
	 * @param message : permet d'afficher un message défini en fonction des erreurs
	 */
	public ServiceException(String message) {
		super(message);
	}

}
