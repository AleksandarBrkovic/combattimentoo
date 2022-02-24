
public class Orso extends Predatori {

	public Orso(double vel, int f, int vit, int ene, int att, int dif, int da, int alt, int lung, int larg, double pe) {
		super(vel= 70,
				f= (int) (Math.random()*(20-5+1)+5), 
				vit= 30, 
				ene= 100, 
				att= (int) (Math.random()*(20-5+1)+5), 
				dif= (int) (Math.random()*10), 
				da= (int) (Math.random()*(30-10+1)+10), 
				alt= (int)(Math.random()*(300-250+1)+250),
				lung= (int) (Math.random()*(280-170+1)+170), 
				larg= 140, 
				pe=  (Math.random()*(550-450+1)+450));a
		// TODO Auto-generated constructor stub
	}

}
