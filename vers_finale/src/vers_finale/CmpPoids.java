package vers_finale;

import java.util.Comparator;

public class CmpPoids implements Comparator<Vehicule>{

	@Override
	public int compare(Vehicule o1, Vehicule o2) {
		// TODO Auto-generated method stub
		return o1.getPoids()-o2.getPoids();
	}

}
