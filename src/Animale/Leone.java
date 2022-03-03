package Animale;

public class Leone extends Predatori {

	public Leone(double vel, int f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg,
			double pe) {
		super(vel= 100,
				f= 100, 
				vit= 100, 
				ene= 100, 
				att= 56.25, 
				dif=75, 
				da= 56.25, 
				alt= 140,
				lung= 350, 
				larg= 80, 
				pe=  (Math.random()*(300-272+1)+272));
		
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
