package service;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.factory.annotation.Autowired;

import domaine.Conseiller;
import domaine.Gerant;

public class AuthentificationService implements IAuthentificationService, SessionAware {

	@Autowired
	private IConseillerService conseillerService;

	@Autowired
	private IGerantService gerantService;

	private Map<String, Object> userSession;

	public void setSession(Map<String, Object> session) {
		this.userSession = session;
	}

	public boolean authConseiller(String login, String password) {
		// recuperation d'un eventuel conseiller avec ce login
		Conseiller conseiller = this.conseillerService.getConseiller(login);
		// s'il n'y a pas de conseiller avec ce login
		if (conseiller.equals(null)) {
			return false;
		}
		// si in y a un conseiller avec ce login
		else {
			// comparaison du mot de passe saisi avec celui du conseiller correspondant au
			// login
			if (password.equals(conseiller.getPassword()))
			// si bon mot de passe
			{
				// mise en session du conseiller
				// this.userSession.put("conseiller", conseiller);
				return true;
			}
			// si mauvais mot de passe
			else {
				return false;
			}
		}
	}

	public boolean authGerant(String login, String password) {
		// recuperation d'un eventuel gerant avec ce login
		Gerant gerant = this.gerantService.getGerant(login);
		// s'il n'y a pas de gerant avec ce login
		if (gerant.equals(null)) {
			return false;
		}
		// si in y a un gerant avec ce login
		else {
			// comparaison du mot de passe saisi avec celui du gerant correspondant au login
			if (password.equals(gerant.getPassword()))
			// si bon mot de passe
			{
				// mise en session du gerant
				this.userSession.put("gerant", gerant);
				return true;
			}
			// si mauvais mot de passe
			else {
				return false;
			}
		}
	}

}
