package Terreno;
import Animale.Animale;

public class Foresta extends Terreno {
	public Foresta (String tdt) {
		super(tdt= "SEI NELLA FORESTA");
		
		
	}
	public void bonusTerreno(Animale a1) {
		
		if(a1.CalcoloVolume()>=2) {
			int y=(int) (Math.random()*(20-5+1)+5);
		    a1.setVelocità(a1.getVelocità() - y);
			
			
		}else {
			int y=(int) (Math.random()*(10-5+1)+5);
			a1.setVelocità(a1.getVelocità() + y);
		}
		
		
	}
	

}
