package Animale;
public abstract class Predatori extends Animale {

	public Predatori(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg,
			float pe) {
		super(vel, f, vit, ene, att, dif, da, alt, lung, larg, pe);
		// TODO Auto-generated constructor stub
	}
	
	public void attacco(Animale a1 ) { //graffio
		System.out.println("GRAFFIALO ZIO PORCO SIUM");
		int x=(int) (Math.random()*(10-5+1)+5);
		this.danni+= x;
		this.energia-=1;
		
		
	}
	
	

}
