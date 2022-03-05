package Animale;

public class Rapace extends Uccelli {

	public Rapace() {
		super( 62.5,
				31.64, 
				100, 
				100, 
				31.64, 
				100, 
				31.64, 
				50,
				(int) (Math.random()*(58-34+1)+34), 
				(int) (Math.random()*(120-80+1)+80), 
				 (float)(Math.random()*(1.25-8.5+1)+8.5));
		Volare();
	}
	public void attaccoSpeciale(Animale a1 ) { //picchiata
		int x=(int) (Math.random()*(10-5+1)+5); //danni ++
		int y=(int) (Math.random()*(10-5+1)+5); //energia-- 
		this.danni+=x;
		this.energia-=y;
	
	}
	public void Volare() {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.setVelocità(this.getVelocità() + x);
	}

}
   