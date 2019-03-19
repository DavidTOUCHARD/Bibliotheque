package eu.ensup.bibliothequeenligne.domaine;

public class Livre {
	
	private String titre;
	private String auteur;
	private String dateparution;
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getDateparution() {
		return dateparution;
	}
	public void setDateparution(String dateparution) {
		this.dateparution = dateparution;
	}
	@Override
	public String toString() {
		return "Livre [titre=" + titre + ", auteur=" + auteur + ", dateparution=" + dateparution + "]";
	}
	public Livre(String titre, String auteur, String dateparution) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.dateparution = dateparution;
	}
	
}
