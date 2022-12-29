package crud;

public class Admin_user {
	
	private int id;
	private String nom,prenom,log,pass;
	public Admin_user(int id, String nom, String prenom, String log, String pass) {
		this.id = id;
		this.log = log;
		this.pass = pass;
		this.nom = nom;
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
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
	public Admin_user(String nom, String prenom, String log, String pass) {
		super();
		this.log = log;
		this.pass = pass;
		this.nom = nom;
		this.prenom = prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	

}
