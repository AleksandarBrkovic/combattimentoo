
public abstract class Anfibi extends Animale {

	public Anfibi(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg,
			double pe) {
		super(vel, f, vit, ene, att, dif, da, alt, lung, larg, pe);
		// TODO Auto-generated constructor stub
	}
	public void attaccoSpeciale(Animale a2 ) { //beccata
		System.out.println("VANTAGGIO IN ACQUA");
		int x=(int) (Math.random()*(10-5+1)+5);
		this.attacco+= x;
		this.danni+=x;
		
	}
	
	public void abilità(Animale a2 ) {
		
	}

}
