package vers_finale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class TableauVehicule {
	private Vehicule[] vehicules= new Vehicule[6];

	public TableauVehicule() {
		vehicules[0]=new Vehicule("Must", "M1", 2021, "rouge", 1500, 250, "V01");
		vehicules[1]=new Vehicule("Alpha", "ROM1", 2022, "noir", 1300, 210, "V02");
		vehicules[2]=new Vehicule("Dacia", "Logan", 2015, "noir", 1000, 160, "V03");
		vehicules[3]=new Vehicule("Renault", "R2008", 2020, "blanche", 1900, 180, "V04");
		vehicules[4]=new Vehicule("Ferrari", "F22", 2019, "rouge", 1600, 310, "V05");
		vehicules[5]=new Vehicule("Jeep", "LC05", 2023, "gris", 2700, 200, "V06");
	}
	public void trierTabVehicule(Comparator<Vehicule> cmp) {
		Arrays.sort(vehicules,cmp);
	}
	public boolean tester(Vehicule vh) {
		for(Vehicule v:vehicules) {
			if(v.equals(vh)) 
				return true;
		}
		return false;
	}
	public boolean AjouterVehicule(Vehicule v) {
		ArrayList<Vehicule> list= new ArrayList<Vehicule>(Arrays.asList(vehicules));
		if(this.tester(v))
			return false;
		list.add(v);
		vehicules = list.toArray(new Vehicule[list.size()]);
		return true;
	}
	public boolean SupprimerVehicule(Vehicule v) {
		if(!this.tester(v)) {
			return false;
		}
		ArrayList<Vehicule> list = new ArrayList<Vehicule>(Arrays.asList(vehicules));
		list.remove(v);
		vehicules= list.toArray(new Vehicule[list.size()]);
		return true;
	}
	public int nbElement() {
		return vehicules.length;
	}
	public void inverserTableau() {
		ArrayList<Vehicule> list = new ArrayList<Vehicule>(Arrays.asList(vehicules));
		Collections.reverse(list);
		vehicules= list.toArray(new Vehicule[list.size()]);	
	}
	
	public void afficher() {
		for(Vehicule v:vehicules) {
			System.out.println(v);
		}
	}
	public int vitessmax() {
		Arrays.sort(vehicules,new CmpVitesseMax());
		return vehicules[vehicules.length-1].getVitesse_max();
		
	}
	public boolean eqTab(Vehicule[] v1,Vehicule[] v2) {
		return Arrays.equals(v1, v2);
	}


	
}
