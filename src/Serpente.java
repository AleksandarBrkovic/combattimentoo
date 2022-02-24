
public class Serpente extends Anfibi{

	public Serpente(double vel, int f, int vit, int ene, int att, int dif, int da, int alt, int lung, int larg,
			double pe) {
		super(vel= 13.75,
				f= (int) (Math.random()*(30-10+1)+10), 
				vit= 30, 
				ene= 100, 
				att= (int) (Math.random()*(20-5+1)+5), 
				dif= (int) (Math.random()*10), 
				da= (int) (Math.random()*(30-10+1)+10), 
				alt= 20,
				lung= (int) (Math.random()*(300-250+1)+250), 
				larg= 30, 
				pe=  (Math.random()*(15-10+1)+10));
	}

}
