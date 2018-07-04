package domaine;


public class Compte {
	

	private Integer idCompte;
	

	private String numCompte;
	

	private String typeCompte;
	

	private Double soldeCompte;
	

	private Double decouvertMaxCompte;
	

	private ClientProxi client;

		
	
	public Compte() {
		super();
		// Instancier client vide
		this.client= new ClientProxi();
	}



	public Compte(Integer idCompte, String numCompte, String typeCompte, 
			Double soldeCompte, Double decouvertMaxCompte) {
		super();
		this.idCompte = idCompte;
		this.numCompte = numCompte;
		this.typeCompte = typeCompte;
		this.soldeCompte = soldeCompte;
		this.decouvertMaxCompte = decouvertMaxCompte;
		
		// Instancier client vide
		this.client= new ClientProxi();
	}



	public Integer getIdCompte() {
		return idCompte;
	}



	public void setIdCompte(Integer idCompte) {
		this.idCompte = idCompte;
	}



	public String getNumCompte() {
		return numCompte;
	}



	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}



	public String getTypeCompte() {
		return typeCompte;
	}



	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}



	public Double getSoldeCompte() {
		return soldeCompte;
	}



	public void setSoldeCompte(Double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}



	public Double getDecouvertMaxCompte() {
		return decouvertMaxCompte;
	}



	public void setDecouvertMaxCompte(Double decouvertMaxCompte) {
		this.decouvertMaxCompte = decouvertMaxCompte;
	}



	public ClientProxi getClient() {
		return client;
	}



	public void setClient(ClientProxi client) {
		this.client = client;
	}


	
	
	
	
	

}
