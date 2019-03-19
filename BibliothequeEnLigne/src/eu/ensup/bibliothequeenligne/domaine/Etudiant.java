package eu.ensup.bibliothequeenligne.domaine;

public class Etudiant {
	
	private String nom;
	private String prenom;
	private String email;
	private String datenaissance;
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", datenaissance=" + datenaissance
				+ "]";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(String datenaissance) {
		this.datenaissance = datenaissance;
	}
	public Etudiant(String nom, String prenom, String email, String datenaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.datenaissance = datenaissance;
	}

}
