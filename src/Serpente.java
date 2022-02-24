
public class Serpente extends Anfibi{

	public Serpente(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg,
			double pe) {
		super(vel= 13.75,
				f= 42.1875, 
				vit= 100, 
				ene= 100, 
				att= 42.1875, 
				dif= 42.1875, 
				da= 42.1875, 
				alt= 20,
				lung= (int) (Math.random()*(300-250+1)+250), 
				larg= 30, 
				pe=  (Math.random()*(15-10+1)+10));
	}

}
