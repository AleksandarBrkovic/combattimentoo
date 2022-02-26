
public class Serpente extends Anfibi{

	public Serpente(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg,
			double pe) {
		super(vel= 13.75,
				f= 42.1875, 
				vit= 100, 
				ene= 100, 
				att= 42.1875, 
				dif= 42.1875, 
				da= 42.1875, 
				alt= 20,
				lung= (int) (Math.random()*(300-250+1)+250), 
				larg= 30, 
				pe=  (Math.random()*(15-10+1)+10));
	}
	public void abilità(Animale a2) {//veleno
		int x=(int) (Math.random()*(10-5+1)+5);
		this.danni+= x;
		int prob= (int) Math.random()*100+1;
		if(prob<=5) {
			a2.vita=0; // KO istantaneo
		}
	}
	
	public void morsoRapido (Animale a2) {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.attacco+= x;
	}

}
