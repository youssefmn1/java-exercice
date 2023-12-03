package vers_finale;

import java.util.Comparator;

public class CmpMarque implements Comparator<Vehicule>{

	@Override
	public int compare(Vehicule o1, Vehicule o2) {
		// TODO Auto-generated method stub
		return o1.getMarque().compareTo(o2.getMarque());
	}

}
