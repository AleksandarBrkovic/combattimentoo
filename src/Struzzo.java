
public class Struzzo extends Uccelli {

	public Struzzo(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg, int pe) {
		super(vel= 87.5,
				f= 23.73, 
				vit= 100, 
				ene= 100, 
				att= 23.73, 
				dif= 31.64, 
				da= 23.73, 
				alt= (int) (Math.random()*(250-300+1)+250),
				lung=180, 
				larg= 200, 
				pe= (int) (Math.random()*(160-120+1)+120));
		// TODO Auto-generated constructor stub
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
