package Animale;

public class Leone extends Predatori {

	public Leone() {
		super( 100,
				100, 
				1000, 
				100, 
				56.25, 
				75, 
				56.25, 
				140,
				350, 
				80, 
				 (float)(Math.random()*(300-272+1)+272));
		
		agilità();
	}
	public void attaccoSuper( Animale a2) { // agguato
		if(isAttacco(a2)) {
			System.out.println("IL LEONE SI PREPARA ALL'AGGUATO");
			this.bonusDanni=(int) (Math.random()*(10-5+1)+5);
			this.danni+= this.bonusDanni;
			attaccoSpeciale(a2);
			attaccoSpeciale(a2); 
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}else {
			System.out.println("IL LEONE HA FALLITO L'AGGUATO");
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}
		
		
	}
	public void agilità() {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.setVelocità(this.getVelocità() + x);
	}

}
