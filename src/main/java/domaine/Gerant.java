package domaine;

import java.util.List;

public class Gerant {
	

	private Integer idGerant;
	

	private String nomGerant;
	

	private String prenomGerant;
	

	private String login;
	

	private String password;
	

	private List<Conseiller> conseillersGerant;


	public Integer getIdGerant() {
		return idGerant;
	}


	public void setIdGerant(Integer idGerant) {
		this.idGerant = idGerant;
	}


	public String getNomGerant() {
		return nomGerant;
	}


	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}


	public String getPrenomGerant() {
		return prenomGerant;
	}


	public void setPrenomGerant(String prenomGerant) {
		this.prenomGerant = prenomGerant;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public List<Conseiller> getConseillersGerant() {
		return conseillersGerant;
	}


	public void setConseillersGerant(List<Conseiller> conseillersGerant) {
		this.conseillersGerant = conseillersGerant;
	}


	public Gerant(Integer idGerant, String nomGerant, String prenomGerant, String login, String password,
			List<Conseiller> conseillersGerant) {
		super();
		this.idGerant = idGerant;
		this.nomGerant = nomGerant;
		this.prenomGerant = prenomGerant;
		this.login = login;
		this.password = password;
		this.conseillersGerant = conseillersGerant;
	}


	public Gerant() {
		super();
	}


	@Override
	public String toString() {
		return prenomGerant+" "+nomGerant;
	}
	
	

	
	
	
		

}
