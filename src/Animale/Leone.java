package Animale;

public class Leone extends Predatori {

	public Leone() {
		super( 100,
				100, 
				100, 
				100, 
				56.25, 
				75, 
				56.25, 
				140,
				350, 
				80, 
				 (float)(Math.random()*(300-272+1)+272));
		
		agilitÓ();
	}
	public void attaccoSuper( ) { // agguato
		
		this.danni++;
		attaccoSpeciale();
		attaccoSpeciale(); 
		
	}
	public void agilitÓ() {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.setVelocitÓ(this.getVelocitÓ() + x);
	}

}
