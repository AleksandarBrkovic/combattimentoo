package Animale;
public class Serpente extends Anfibi{

	public Serpente() {
		super( 13.75,
				 42.1875, 
				 1000, 
				 100, 
				 42.1875, 
				 42.1875, 
				 42.1875, 
				 20,
				 (int) (Math.random()*(300-250+1)+250), 
				 30, 
				 (float) (Math.random()*(15-10+1)+10));
		morsoRapido();
	}
	public void attaccoSuper(Animale a2) {//veleno

		if(isAttacco(a2)) {
			System.out.println("IL SERPENTE USA IL SUO VELENO SULL'AVVERSARIO");
			this.bonusDanni=(int) (Math.random()*(10-5+1)+5);
			this.danni+= this.bonusDanni;
			int prob= (int) Math.random()*100+1;
			
			if(prob<=5) {
				a2.vita=0;
				System.out.println("VITA AVVERSARIO: " + a2.vita);
				 // KO istantaneo
			}else {
				System.out.println("VITA AVVERSARIO: " + a2.vita);
			}
			
		}else {
			System.out.println("L'AVVERSARIO HA SCHIVATO IL SUO VELENO");
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}
		
	}
	
	public void morsoRapido () {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.attacco+= x;
	}

}
