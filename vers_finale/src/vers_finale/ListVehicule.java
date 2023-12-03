package vers_finale;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListVehicule {
	ArrayList<Vehicule> listvh = new ArrayList<Vehicule>();

	public ListVehicule() {
		listvh.add(new Vehicule("Must", "M1", 2021, "rouge", 1500, 250, "V01"));
		listvh.add(new Vehicule("Alpha", "ROM1", 2022, "noir", 1300, 210, "V02"));
		listvh.add(new Vehicule("Dacia", "Logan", 2015, "noir", 1000, 160, "V03"));
		listvh.add(new Vehicule("Renault", "R2008", 2020, "blanche", 1900, 180, "V04"));
		listvh.add(new Vehicule("Ferrari", "F22", 2019, "rouge", 1600, 310, "V05"));
		listvh.add(new Vehicule("Jeep", "LC05", 2023, "gris", 2700, 200, "V06"));
	}
	
	public void afficher() {
		for(Vehicule v:listvh) {
			System.out.println(v);
		}
	}
	public void parcourIt() {
		Iterator<Vehicule> it =listvh.iterator();
	    while (it.hasNext()) {
	        System.out.println(it.next());
	      }
	}
	public void ajouterVehicule(Vehicule vh) {
		listvh.add(0,vh);
	}
	public Vehicule recuperVehicule(int index) {
		if(index>=0 && index <listvh.size())
			return listvh.get(index);
		 throw new IllegalArgumentException("l indice  doit etre compris entre 0 et la taille");
	}
	public boolean supprimerVehicule(Vehicule vh) {
		return listvh.remove(vh);
	}
	public boolean rechercheVehicule(Vehicule vh) {
		return listvh.contains(vh);
	}
	public void trierVehicules(Comparator<Vehicule> cmp) { // fonction general pour faire le trie par marque,matricule,modele
		Collections.sort(listvh,cmp);
	}
	public ArrayList<Vehicule> copierList() {
		ArrayList<Vehicule> newlist = new ArrayList<Vehicule>();
		newlist.addAll(listvh);
		return newlist;
		//return new ArrayList<Vehicule>(listvh);
	}
	public void melangerList() {
		Collections.shuffle(listvh);
	}
	public void inverserList() {
		Collections.reverse(listvh);
	}	
	public ArrayList<Vehicule> subList(int start, int end){
		if(start >=0 && end<listvh.size() && start<end) {
			return new ArrayList<Vehicule>(listvh.subList(start, end));
		}
		throw new IllegalArgumentException("un probleme dans start ou end");
	}
	public boolean compareList(ArrayList<Vehicule> list) {
		return listvh.equals(list); // true if meme nature , meme taille , le contenu des de liste est le meme 
	}
	public void echangerList(int v1,int v2) {
		Collections.swap(listvh, v1, v2);
	}
	public void viderList() {
		listvh.clear();
	}
	public boolean listEstVide() {
		return listvh.isEmpty();
	}
}
