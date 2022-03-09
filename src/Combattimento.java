import Animale.*;
import Terreno.*;


public class Combattimento {
	private int turno;
	
	public Combattimento(Animale a1, Animale a2, Terreno t1) {
		this.turno=0;
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
		System.out.println("------------------------------------------------------");
		sceltaChiAttacca=(int) (Math.random()*1);
		int win=0;
		
		do{
			
			turno++;
			System.out.println("siamo al turno: "+ turno);
			if(sceltaChiAttacca==0) {
				System.out.println("è il turno del " + a1.getClass().getSimpleName());
				sceltaAttacco(a1,a2);
				
				sceltaChiAttacca=1;
				
			}else {
				System.out.println("è il turno del " + a2.getClass().getSimpleName());
				sceltaAttacco(a2,a1);
				sceltaChiAttacca=0;
				
			}
		
			reset(a1,a2);
			System.out.println("------------------------------------------------------");
			
			if(a1.getVita()<=0||a2.getVita()<=0 || a1.getEnergia()<=0 || a2.getEnergia()<=0) {
				win=1;
				if(a1.getVita()<=0 || a1.getEnergia()<=0) {
					System.out.println("IL VINCITORE DELLO SCONTRO= " + a2.getClass().getSimpleName());
				}else {
					System.out.println("IL VINCITORE DELLO SCONTRO= " + a1.getClass().getSimpleName());
				}
				
			}
			
		}while(win!=1);
		
	}
	private void reset(Animale a1, Animale a2) {
		a1.setBonusDanni(0);
		a1.setBonusDifesa(0);
		a1.setBonusForza(0);
		a1.setBonusVelocità(0);
		a2.setBonusDanni(0);
		a2.setBonusDifesa(0);
		a2.setBonusForza(0);
		a2.setBonusVelocità(0);
		
	}
	public void sceltaAttacco(Animale a1, Animale a2) {

		switch((int)(Math.random()*3+1)) {
		case 1:
			a1.attaccoSuper(a2);
			if(a1.isPresaInMorso()) {
				do {
					this.turno++;
					System.out.println("siamo al turno: "+ this.turno);
					a1.attaccoSuper(a2);
					
				}while(a1.getEnergia()>0);
			}
			break;
		case 2:
			a1.attaccoSpeciale(a2);
			break;
		case 3:
			a1.attacco(a2);
			if(a1 instanceof Orso) {
				int x=(int) (Math.random()*2+1);
				if(x==1) {
					a1.attacco(a2);
				}else {
					a1.attaccoSpeciale(a2);
				}
			}
			break;
			default:
				
		}
	}
	

}
