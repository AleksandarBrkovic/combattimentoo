package Animale;
public abstract class Predatori extends Animale {

	public Predatori(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg,
			float pe) {
		super(vel, f, vit, ene, att, dif, da, alt, lung, larg, pe);
		// TODO Auto-generated constructor stub
	}
	
	public void attaccoSpeciale(Animale a2) { //graffio
		if(isAttacco(a2)) {
			System.out.println("GRAFFIALO ZIO PORCO SIUM");
			this.bonusDanni=(int) (Math.random()*(10-5+1)+5);
			this.danni+= this.bonusDanni;
			this.energia-=1;
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}else {
			System.out.println("ZIO PORCO L'HAI MANCATO");
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}
		
	}
	
	

}
