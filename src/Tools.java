import Animale.Animale;
import Animale.Coccodrillo;
import Animale.Leone;
import Animale.Orso;
import Animale.Rapace;
import Animale.Serpente;
import Animale.Struzzo;
import Terreno.Fiume;
import Terreno.Foresta;
import Terreno.Pianura;
import Terreno.Terreno;

public class Tools {
public static Animale RandomAnimale() {
		
		int z= (int) (Math.random()*6+1);
		switch(z) { // random per decidere che animale spawnare
		case 1: 
			return new Struzzo();
			
		case 2: 
			return new Leone();
			
		case 3: 
			return new Orso();
			
		case 4: 
			return new Rapace();
			
		case 5: 
		return new Coccodrillo();
			
		case 6: 
		return new Serpente();
			
			default:
				return null;
		}
		
	}	
	public static Terreno RandomTerreno() {
		
		int z= (int) (Math.random()*3+1);
		switch(z){
			case 1:
				return new Pianura();
			case 2:
				return new Fiume();
			case 3:
				return new Foresta();
				default:
					return null;
		}
	}

}
