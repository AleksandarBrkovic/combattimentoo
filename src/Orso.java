
public class Orso extends Predatori {

	public Orso(double vel, double f, int vit, int ene, double att, double dif, double da, int alt, int lung, int larg, double pe) {
		super(vel= 70,
				f= 75.0, 
				vit= 100, 
				ene= 100, 
				att= 75.0, 
				dif= 56.25, 
				da= 100, 
				alt= (int)(Math.random()*(300-250+1)+250),
				lung= (int) (Math.random()*(280-170+1)+170), 
				larg= 140, 
				pe=  (Math.random()*(550-450+1)+450));
		// TODO Auto-generated constructor stub
	}
	public void pellicciaSpessa() {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.difesa+=x;
		
	}
	public void possanza() {
		int x=(int) (Math.random()*(10-5+1)+5);
		this.forza+=x;
		
	}

}
