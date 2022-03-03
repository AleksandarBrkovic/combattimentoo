package Animale;
public class Coccodrillo extends Anfibi {

	public Coccodrillo(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg,
			double pe) {
		super(vel= 60,
				f= 56.25, 
				vit= 100, 
				ene= 100, 
				att= 100, 
				dif= 23.73, 
				da= 75, 
				alt= 50,
				lung= (int) (Math.random()*(500-350+1)+350), 
				larg=70, 
				pe=  (Math.random()*(750-225+1)));
		// TODO Auto-generated constructor stub
	}
	public void abilità(Animale a2, boolean turno) {
		int x=(int) (Math.random()*(10-5+1)+5);
		a2.attacco=0;
		a2.setVelocità(0);
		if(turno==true) {
			this.danni+=x;
			this.energia-=x;
		}
				
	}
}
