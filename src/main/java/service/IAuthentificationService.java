package service;

public interface IAuthentificationService {

	public boolean authConseiller(String login, String password);
	
	public boolean authGerant(String login, String password);
}
