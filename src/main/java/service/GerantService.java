package service;

import domaine.Gerant;

public class GerantService implements IGerantService {

	public Gerant getGerant(String login) {
		Gerant gerant = new Gerant(null,"Batault","Frederic","abc","123",null);
		return gerant;
	}

}
