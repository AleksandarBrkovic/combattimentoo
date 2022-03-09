package Animale;

public class Rapace extends Uccelli {

	public Rapace() {
		super( 62.5,
				31.64, 
				1000, 
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
	public void attaccoSuper(Animale a2) { //picchiata
		
		if(isAttacco(a2)) {
			System.out.println("IL RAPACE SCENDE IN PICCHIATAAAAAAAAA");
			this.bonusDanni=(int) (Math.random()*(10-5+1)+5); //danni ++
			int y=(int) (Math.random()*(10-5+1)+5); //energia-- 
			this.danni+=this.bonusDanni;
			this.energia-=y;
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}else {
			System.out.println("CONFONDENDOSI NON HA EFFETUATO LA PICCHIATA");
			System.out.println("VITA AVVERSARIO: " + a2.vita);
		}
		
	
	}
	public void Volare() {
		this.bonusVelocità=(int) (Math.random()*(10-5+1)+5);
		this.velocità+= this.bonusVelocità;
	}

}
   