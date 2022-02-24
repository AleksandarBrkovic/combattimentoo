
public class Struzzo extends Uccelli {

	public Struzzo(double vel, int f, int vit, int ene, int att, int dif, int da, int alt, int lung, int larg, int pe) {
		super(vel= 87.5,
				f= (int) (Math.random()*(20-5+1)+5), 
				vit= 50, 
				ene= 100, 
				att= (int) (Math.random()*10), 
				dif= (int) (Math.random()*10), 
				da= (int) (Math.random()*10), 
				alt= (int) (Math.random()*(250-300+1)+250),
				lung=180, 
				larg= 200, 
				pe= (int) (Math.random()*(160-120+1)+120));
		// TODO Auto-generated constructor stub
	}

}
