package crud;

public class Resp_u {

	private String cni,nom,prenom,login,password;

	public Resp_u(String cni, String nom, String prenom, String login, String password) {
		super();
		this.cni = cni;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	public String getCni() {
		return cni;
	}

	public void setCni(String cni) {
		this.cni = cni;
	}

	public Resp_u(String nom, String prenom, String login, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}

	public Resp_u() {
		super();
		
	}
 
	
	
	
	
	
	
	
	
}
