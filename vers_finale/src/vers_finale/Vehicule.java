package vers_finale;

public class Vehicule implements Comparable<Vehicule>{
	private String marque;
	private String modele;
	private int annee;
	private String couleur;
	private int poids;
	private int vitesse_max;
	public String matricule;

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public int getVitesse_max() {
		return vitesse_max;
	}

	public void setVitesse_max(int vitesse_max) {
		this.vitesse_max = vitesse_max;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Vehicule(String marque, String modele, int annee, String couleur, int poids, int vitesse_max,
			String matricule) {
		this.marque = marque;
		this.modele = modele;
		this.annee = annee;
		this.couleur = couleur;
		this.poids = poids;
		this.vitesse_max = vitesse_max;
		this.matricule = matricule;
	}

	@Override
	public String toString() {
		return "Vehicule [marque=" + marque + ", modele=" + modele + ", annee=" + annee + ", couleur=" + couleur
				+ ", poids=" + poids + ", vitesse_max=" + vitesse_max + ", matricule=" + matricule + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Vehicule) {
			Vehicule v = (Vehicule) obj;
			return v.matricule==this.matricule;
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Vehicule o) {
		// TODO Auto-generated method stub
		return this.matricule.compareTo(o.matricule);
	}
}
