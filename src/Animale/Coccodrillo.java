package Animale;
public class Coccodrillo extends Anfibi {

	public Coccodrillo() {
		super( 60,
				 56.25, 
				 1000, 
				 100, 
				 100, 
				 23.73, 
				 75, 
				 50,
				 (int) (Math.random()*(500-350+1)+350), 
				 70, 
				  (float)(Math.random()*(750-225+1)));
		
	}
	public void attaccoSuper(Animale a2 ) {
	
		if(isAttacco(a2)) {
			System.out.println("L'AVVERSARIO E' FINITO NELLE SUE FAUCI E NON NE ESCE PIU'");
			this.bonusDanni=(int) (Math.random()*(10-5+1)+5);
			a2.attacco=0;
			a2.setVelocità(0);
			this.danni+=this.bonusDanni;
			this.energia-=(int) (Math.random()*(10-5+1)+5);
			this.isPresaInMorso=true;
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}else {
			System.out.println("L'AVVERSARIO E' SCAMPATO DALLE SUE FAUCI");
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}
		
		
				
	}
}
