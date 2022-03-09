import Animale.*;
import Terreno.*;


public class Main {
public Main() {
	Animale a1 = Tools.RandomAnimale();
	
	Animale a2 = Tools.RandomAnimale();

	Terreno t1 = Tools.RandomTerreno();
	
	new Combattimento( a1,  a2,  t1);
	
}
	public static void main(String[] args) {
		
		new Main();
		
		
		
		}
		
	
	
	

}
