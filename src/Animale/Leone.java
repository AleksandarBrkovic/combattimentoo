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
				(Math.random()*(300-272+1)+272));
		
		// TODO Auto-generated constructor stub
	}
	public void abilità(Animale a1 ) { // agguato
		
		this.danni++;
		attaccoSpeciale(a1);
		attaccoSpeciale(a1); 
		
	}
	public void agilità() {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.setVelocità(this.getVelocità() + x);
	}

}
