package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling
	 * 			samling av kort som skal sorteres. 
	 */
	
	public static void sorter(KortSamling samling) {
		
		// TODO - START
		boolean sortert = true;
		int i = 1;
		Kort[] nySamling = samling.getSamling();
		int antall = samling.getAntalKort();
		Kort[] sortertSamling = new Kort[nySamling.length];
		while(sortert && i < antall) {
			if(nySamling[i].compareTo(nySamling[i-1]) < 0) {
				sortert = false;
			}
			i++;
		}
		if(!sortert) {
			for(int kortNr = 0; kortNr < antall; kortNr++) {
				int minPos = 0;
				for(int posNr = 1; posNr < antall; posNr++) {
					if(nySamling[posNr].compareTo(nySamling[minPos]) < 0) {
						minPos = posNr;
					}
				}
				sortertSamling[kortNr] = nySamling[minPos];
				nySamling[minPos] = new Kort(Kortfarge.Spar, Regler.ANTALL_KORT_START+1);
			}
			for(int t = 0; t < antall; t++) {
				nySamling[t] = sortertSamling[t];
			}
		}
		
		//throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}
	
	/**
	 * Stokkar en kortsamling. 
	 * 
	 * @param samling
	 * 			samling av kort som skal stokkes. 
	 */
	public static void stokk(KortSamling samling) {
		
		// TODO - START
		Kort[] nySamling = samling.getSamling();
		int antall = samling.getAntalKort();
		for(int i = 0; i < antall; i++) {
			Kort kort1 = nySamling[i];
			int index = (int)Math.random()*antall;
			Kort kort2 = nySamling[index];
			nySamling[i] = kort2;
			nySamling[index] = kort1;
		}
		
		//throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}
	
}
