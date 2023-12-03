package vers_finale;

public class Voiture extends Vehicule{
    private int nbPortes;
    private String carburant;
	public Voiture(String marque, String modele, int annee, String couleur, int poids, int vitesse_max,
			String matricule, int nbPortes, String carburant) {
		super(marque, modele, annee, couleur, poids, vitesse_max, matricule);
		this.nbPortes = nbPortes;
		this.carburant = carburant;
	}
	@Override
	public String toString() {
		return super.toString() + "Voiture [nbPortes=" + nbPortes + ", carburant=" + carburant ;
	}
	@Override
	public boolean equals(Object obj) {
		if(super.equals(obj)==false)
			return false;
		if(obj instanceof Voiture) {
			Voiture v = (Voiture) obj;
			return v.matricule==this.matricule;
		}
		else {
			return false;
		}
	}

	@Override
	public int compareTo(Vehicule o) {
		// TODO Auto-generated method stub
		return super.compareTo(o);
	}

	

	

}
