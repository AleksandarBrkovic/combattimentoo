
public abstract class Uccelli extends Animale {
	Animale att;
	public Uccelli(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg, double pe) {
		super(vel, f, vit, ene, att, dif, da, alt, lung, larg, pe);
		
	}
	public void attaccoSpeciale( ) { //beccata
		System.out.println("USA BECCATA");
		int x=(int) (Math.random()*(10-5+1)+5);
		this.attacco+= x;
		
	}
	
	
}
