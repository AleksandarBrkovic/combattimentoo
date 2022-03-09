import Animale.*;
import Terreno.*;

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
	public static Terreno RandomTerreno() { //random terreno
		
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
