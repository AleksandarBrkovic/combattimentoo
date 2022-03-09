package Animale;
public abstract class Uccelli extends Animale {
	Animale att;
	public Uccelli(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg, float pe) {
		super(vel, f, vit, ene, att, dif, da, alt, lung, larg, pe);
		
	}
	public void attaccoSpeciale(Animale a2) { //beccata
		System.out.println("USA BECCATA");
		if(isAttacco(a2)) {
			this.bonusAttacco=(int) (Math.random()*(10-5+1)+5);
			this.attacco+= this.bonusAttacco;
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}else {
			System.out.println("NON HA USATO BECCATA");
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}
		
		
		
	}	
}
