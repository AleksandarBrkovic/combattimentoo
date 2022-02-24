
public class Coccodrillo extends Anfibi {

	public Coccodrillo(double vel, int f, int vit, int ene, int att, int dif, int da, int alt, int lung, int larg,
			double pe) {
		super(vel= 60,
				f= (int) (Math.random()*(20-5+1)+5), 
				vit= 30, 
				ene= 100, 
				att= (int) (Math.random()*(20-5+1)+5), 
				dif= (int) (Math.random()*10), 
				da= (int) (Math.random()*(30-10+1)+10), 
				alt= 50,
				lung= (int) (Math.random()*(500-350+1)+350), 
				larg=70, 
				pe=  (Math.random()*(750-225+1)));
		// TODO Auto-generated constructor stub
	}

}
