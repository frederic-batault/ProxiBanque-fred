package service;

import domaine.Conseiller;

public class ConseillerService implements IConseillerService {

	public Conseiller getConseiller(String login) {
		Conseiller conseiller = new Conseiller(null,"a","b","def","456");
		return conseiller;
	}

}
