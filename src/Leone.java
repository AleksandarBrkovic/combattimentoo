
public class Leone extends Predatori {

	public Leone(double vel, int f, int vit, int ene, int att, int dif, int da, int alt, int lung, int larg,
			double pe) {
		super(vel= 100,
				f= (int) (Math.random()*(20-5+1)+5), 
				vit= 30, 
				ene= 100, 
				att= (int) (Math.random()*(20-5+1)+5), 
				dif= (int) (Math.random()*10), 
				da= (int) (Math.random()*(30-10+1)+10), 
				alt= 140,
				lung= 350, 
				larg= 80, 
				pe=  (Math.random()*(300-272+1)+272));
		// TODO Auto-generated constructor stub
	}

}
