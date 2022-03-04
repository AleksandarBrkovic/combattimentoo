import Animale.*;
import Terreno.*;


public class Combattimento {
	
	
	public static void Combattimento(Animale a1, Animale a2, Terreno t1) {
		int turno=0;
		int sceltaChiAttacca=0;
		Discorso d1= new Discorso();
		d1.StampaDiscorso();
		a1.RandomAnimale(); //spawna animale random
		a2.RandomAnimale(); //spawna animale random
		t1.RandomTerreno(); // spawna terreno random
		t1.stampaTerreno();
		System.out.println("NARRATORE: Ecco le statistiche dei nostri combattenti e dove combatteranno");
		a1.stampaStats();
		a2.stampaStats();
		sceltaChiAttacca=(int) (Math.random()*1);
		
		/*do {
			turno++;
			System.out.println("siamo al turno: "+ turno);
			if(sceltaChiAttacca==0) {
				System.out.println("è il turno del");
			}
			
			
			
			
			
		}while(a1.getVita()>0||a2.getVita()>0);*/
		
	}
	
	

}
