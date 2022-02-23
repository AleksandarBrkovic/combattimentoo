
public class Rapace extends Uccelli {

	public Rapace(double vel, int f, int vit, int ene, int att, int dif, int da, int alt, int lung, int larg, double pe) {
		super(vel= 62.5,
				f= (int) (Math.random()*(20-5+1)+5), 
				vit= 30, 
				ene= 100, 
				att= (int) Math.random()*(20-5+1)+5, 
				dif= (int) Math.random()*10, 
				da= (int) Math.random()*(30-10+1)+10, 
				alt= 50,
				lung= (int) Math.random()*(58-34+1)+34, 
				larg= (int) Math.random()*(120-80+1)+80, 
				pe=  Math.random()*(1.25-8.5+1)+8.5);
		// TODO Auto-generated constructor stub
	}


}
