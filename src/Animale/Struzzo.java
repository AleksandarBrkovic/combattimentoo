package Animale;

public class Struzzo extends Uccelli {

	public Struzzo() {
		super( 87.5,
				23.73, 
				1000, 
				100, 
				23.73, 
				31.64, 
				23.73, 
				(int) (Math.random()*(250-300+1)+250),
				180, 
				200, 
				(int) (Math.random()*(160-120+1)+120));
		
	}

public void attaccoSuper(Animale a2) {
	if(isAttacco(a2)) {
		System.out.println("METTE LA TESTA SOTTO LA SABBIA");
		this.bonusDifesa=(int) (Math.random()*(10-5+1)+5);
		this.difesa+= this.bonusDifesa;
		int prob=0;
		prob=(int) (Math.random()*1);
		if(prob==1) {
			this.energia++;
		}
		System.out.println("VITA AVVERSARIO: " + a2.vita);
	}else {
		System.out.println("NON HA FATTO IN TEMPO A METTERE LA TESTA SOTTO LA SABBIA");
		System.out.println("VITA AVVERSARIO: " + a2.vita);
	}
	
}

}
