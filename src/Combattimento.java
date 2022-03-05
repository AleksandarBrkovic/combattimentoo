import Animale.*;
import Terreno.*;


public class Combattimento {
	
	
	public static void Combattimento(Animale a1, Animale a2, Terreno t1) {
		int turno=0;
		int sceltaChiAttacca=0;
		Discorso d1= new Discorso();
		d1.StampaDiscorso();
		t1.stampaTerreno();
		System.out.println();
		System.out.println("NARRATORE: Ecco le statistiche dei nostri combattenti e dove combatteranno");
		System.out.println("------------------------------------------------------");
		a1.stampaStats();
		System.out.println("------------------------------------------------------");
		a2.stampaStats();
		sceltaChiAttacca=(int) (Math.random()*1);
		int win=0;
		
		do{
			
			System.out.println("siamo al turno: "+ turno);
			if(sceltaChiAttacca==0) {
				System.out.println("è il turno del " + a1.getClass().getSimpleName());
				
			}else {
				System.out.println("è il turno del " + a2.getClass().getSimpleName());
			}
			
			
			
			
			
		}while(win!=1);
		
	}
	
	

}
