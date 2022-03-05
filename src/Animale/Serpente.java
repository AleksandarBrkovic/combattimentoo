package Animale;
public class Serpente extends Anfibi{

	public Serpente() {
		super( 13.75,
				 42.1875, 
				 100, 
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
	public void attaccoSpeciale(Animale a2) {//veleno
		int x=(int) (Math.random()*(10-5+1)+5);
		this.danni+= x;
		int prob= (int) Math.random()*100+1;
		if(prob<=5) {
			a2.vita=0; // KO istantaneo
		}
	}
	
	public void morsoRapido () {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.attacco+= x;
	}

}
