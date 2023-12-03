package vers_finale;

import java.util.ArrayList;

public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListVehicule lv = new ListVehicule();
		//lv.afficher();
		Vehicule V0 = new Vehicule("TTT", "AK47", 2023, "noir", 2700, 350, "V12");
		lv.ajouterVehicule(V0);
		lv.parcourIt();
		System.out.println("");
		lv.melangerList();
		lv.parcourIt();
		System.out.println("");
		lv.inverserList();
		lv.parcourIt();
		System.out.println("");
		ArrayList<Vehicule> lv2 =lv.subList(1, 4); 
		lv.echangerList(0, 5);
		System.out.println("");
		lv.parcourIt();
		System.out.println("la comparaison des 2 liste L1 et L2 : "+ lv.compareList(lv2));
		ArrayList<Vehicule> lv3 =lv.copierList(); 
		System.out.println("la comparaison des 2 liste L1 et L3 : "+ lv.compareList(lv3));
		lv.trierVehicules(new CmpPoids()); // CmpVitesseMax , CmpMarque ...
		lv.afficher();
		System.out.println(lv.listEstVide());	
		lv.viderList();
		System.out.println(lv.listEstVide());	
		lv.parcourIt();
	}

}
