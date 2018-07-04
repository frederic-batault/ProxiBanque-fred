package domaine;

import java.util.ArrayList;
import java.util.List;


public class ClientProxi {
	
	// Proprietes
	
	private Integer idClient;
	
	
	private String nomClient;
	

	private String prenomClient;
	
	
	private String emailClient;
	

	private String adresseClient;
	

	private Conseiller conseiller;
	
	
	private List<Compte> comptesClient;

	/**
	 * Constructeur vide
	 */
	public ClientProxi() {
		super();
		
		this.conseiller= new Conseiller();
		this.comptesClient = new ArrayList<Compte>();
	}


	public ClientProxi(Integer idClient, String nomClient, String prenomClient, String emailClient,
			String adresseClient) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
		
		this.conseiller= new Conseiller();
		this.comptesClient = new ArrayList<Compte>();
	}


	
	public Integer getIdClient() {
		return idClient;
	}


	public void setIdClient(Integer idClient) {
		this.idClient = idClient;
	}


	public String getNomClient() {
		return nomClient;
	}


	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}


	public String getPrenomClient() {
		return prenomClient;
	}


	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public String getEmailClient() {
		return emailClient;
	}


	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}


	public String getAdresseClient() {
		return adresseClient;
	}


	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	
	public Conseiller getConseiller() {
		return conseiller;
	}


	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}


	public List<Compte> getComptesClient() {
		return comptesClient;
	}


	public void setComptesClient(List<Compte> comptesClient) {
		this.comptesClient = comptesClient;
	}

	
	
	
	


	
	

}
