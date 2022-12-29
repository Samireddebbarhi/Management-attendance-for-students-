package crud;

public class User {

	
	private int id;
	
	 private String CNE,nom,prenom,DateDeNaissaance,Filiere,Parcours,semestre;

		public String getDateDeNaissaance() {
		return DateDeNaissaance;
	}
	public void setDateDeNaissaance(String dateDeNaissaance) {
		DateDeNaissaance = dateDeNaissaance;
	}
		public String getCNE() {
		return CNE;
	}
	public void setCNE(String cNE) {
		CNE = cNE;
	}
	public String getParcours() {
		return Parcours;
	}
	public void setParcours(String parcours) {
		Parcours = parcours;
	}
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
		
		
		public String getFiliere() {
			return Filiere;
		}
		public void setFiliere(String filiere) {
			Filiere = filiere;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
	 
		
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		public User(String cNE, String nom, String prenom,String dateDeNai, String filiere, String parcours, String semestre) {
			super();
			this.CNE=cNE;
			this.nom = nom;
			this.prenom=prenom;
			this.DateDeNaissaance=dateDeNai;
			this.Filiere=filiere;
			this.Parcours=parcours;
			this.semestre=semestre;
		}
		public User(int id, String cNE, String nom, String prenom,String dateDeNai, String filiere, String parcours, String semestre) {
			super();
			this.id = id;
			this.CNE = cNE;
			this.nom = nom;
			this.prenom = prenom;
			this.DateDeNaissaance=dateDeNai;
			this.Filiere = filiere;
			this.Parcours = parcours;
			this.semestre = semestre;
		}
		public User(int id, String nom, String prenom, String filiere) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.Filiere = filiere;
		}
		public User(int id) {
			super();
			this.id = id;
		}
		 
		
	}


