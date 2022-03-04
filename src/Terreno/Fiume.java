package Terreno;
import Animale.*;

public class Fiume extends Terreno {
	public Fiume( ) {
		super("SEI IN UN FIUME");
		
	}
	
	
public void bonusTerreno( Animale a1) {
		if(a1 instanceof Anfibi) {	//verifica di che tipo è l'oggetto
			System.out.println("VANTAGGIO IN ACQUA");
			
			a1.setAttacco(a1.getAttacco()+(int) (Math.random()*(10-5+1)+5));
			a1.setDanni(a1.getDanni()+(int) (Math.random()*(10-5+1)+5));		
		}
	
	}
}
