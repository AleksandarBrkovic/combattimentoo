package Animale;

public class Struzzo extends Uccelli {

	public Struzzo() {
		super( 87.5,
				23.73, 
				100, 
				100, 
				23.73, 
				31.64, 
				23.73, 
				(int) (Math.random()*(250-300+1)+250),
				180, 
				200, 
				(int) (Math.random()*(160-120+1)+120));
	}

	public void TestaSottoLaSabbia() {
		this.difesa+= (int) (Math.random()*(10-5+1)+5);
		int prob=0;
		prob=(int) (Math.random()*1);
		if(prob==1) {
			this.energia++;
		}
	}

}
