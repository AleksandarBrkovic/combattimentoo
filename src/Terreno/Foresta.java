package Terreno;
import Animale.Animale;

public class Foresta extends Terreno {
	public Foresta () {
		super( "SEI NELLA FORESTA");
		
		
	}
	public void bonusTerreno(Animale a1) {
		
		if(a1.CalcoloVolume()>=2 || a1.getPeso()>=250) {
			int y=(int) (Math.random()*(20-10+1)+10);
		    a1.setVelocitÓ(a1.getVelocitÓ() - y);
			
			
		}else {
			int y=(int) (Math.random()*(10-5+1)+5);
			a1.setVelocitÓ(a1.getVelocitÓ() + y);
		}
		
		
		
	}
	public void stampaTerreno() {
		System.out.print("Luogo del combattimento: "+ this.getClass().getSimpleName());
		
		}
	

}
