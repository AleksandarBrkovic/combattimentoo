package Animale;
public class Coccodrillo extends Anfibi {

	public Coccodrillo() {
		super( 60,
				 56.25, 
				 100, 
				 100, 
				 100, 
				 23.73, 
				 75, 
				 50,
				 (int) (Math.random()*(500-350+1)+350), 
				 70, 
				  (float)(Math.random()*(750-225+1)));
		// TODO Auto-generated constructor stub
	}
	public void attaccoSpeciale(Animale a2, boolean turno) {
		int x=(int) (Math.random()*(10-5+1)+5);
		a2.attacco=0;
		a2.setVelocità(0);
		if(turno==true) {
			this.danni+=x;
			this.energia-=x;
		}
				
	}
}
