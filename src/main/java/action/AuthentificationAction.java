package action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import service.IAuthentificationService;

public class AuthentificationAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private IAuthentificationService authService;

	private String login;

	private String password;
	
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



	@Action(value = "authentification", results = { @Result(name = "success", location = "/Gerant.jsp"),
			@Result(name = "input", location = "/Conseiller.jsp"),
			@Result(name = "error", location = "/ErreurAuthentification.jsp") })
	public String authentifier() {
		if (authService.authConseiller(this.login, this.password) == true) {
			return "input";
		} else {
			if (authService.authGerant(this.login, this.password) == true) {
				return "success";
			} else {
				return "error";
			}
		}
	}
}
