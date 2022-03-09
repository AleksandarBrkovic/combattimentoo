package Animale;

public class Orso extends Predatori {

	public Orso() {
		super( 70,
				75.0, 
				 1000, 
				 100, 
				 75.0, 
				 56.25, 
				 100, 
				 (int)(Math.random()*(300-250+1)+250),
				 (int) (Math.random()*(280-170+1)+170), 
				 140, 
				 (float) (Math.random()*(550-450+1)+450));
		pellicciaSpessa();
		possanza();
	}
	public void pellicciaSpessa() {
		this.bonusDifesa=(int) (Math.random()*(10-5+1)+5);
		this.difesa+=this.bonusDifesa;
		
	}
	public void possanza() {
		this.bonusForza=(int) (Math.random()*(10-5+1)+5);
		this.forza+=this.bonusForza;
		
	}
	

}
