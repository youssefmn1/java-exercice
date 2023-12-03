package vers_finale;

public class Main {

	public static void main(String[] args) {
		/*Vehicule V1=new Vehicule("Must", "M1", 2021, "rouge", 1500, 250, "V01");
		Vehicule V2=new Vehicule("Alpha", "ROM1", 2022, "noir", 1300, 210, "V02");
		Vehicule V3=new Vehicule("Dacia", "Logan", 2015, "noir", 1000, 160, "V03");
		Vehicule V4=new Vehicule("Renault", "R2008", 2020, "blanche", 1900, 180, "V04");
		Vehicule V5=new Vehicule("Ferrari", "F22", 2019, "rouge", 1600, 310, "V05");
		Vehicule V6=new Vehicule("Jeep", "LC05", 2023, "gris", 2700, 200, "V06");
		Vehicule[] Tab1 = {V1,V2,V3,V4,V5,V6};*/
		TableauVehicule tv=new TableauVehicule();
		tv.afficher(); // correct
		System.out.println(tv.nbElement()); // correct
		Vehicule V6=new Vehicule("Jeep", "LC05", 2023, "gris", 2700, 200, "V06");
		//System.out.println(tv.AjouterVehicule(V6));
		System.out.println(tv.SupprimerVehicule(V6));
		tv.afficher();
		System.out.println("la vitesse max de tous les voiture : " + tv.vitessmax());
		
	}

}
