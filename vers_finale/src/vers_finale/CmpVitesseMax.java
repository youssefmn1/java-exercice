package vers_finale;

import java.util.Comparator;

public class CmpVitesseMax implements Comparator<Vehicule>{

	@Override
	public int compare(Vehicule o1, Vehicule o2) {
		// TODO Auto-generated method stub
		return (int) o1.getVitesse_max()-o2.getVitesse_max();
	}

}
