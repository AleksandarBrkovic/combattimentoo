import Animale.*;
import Terreno.*;


public class Main {
public Main() {
	Animale a1= new Animale();
	 a1=a1.RandomAnimale();
	
	
	Animale a2= new Animale();
	a2= a2.RandomAnimale();
	System.out.println(a1.getClass().getSimpleName());

	Terreno t1= new Terreno();
	Combattimento.Combattimento( a1,  a2,  t1);
	
}
	public static void main(String[] args) {
		
		new Main();
		
		
		
		}
		
	
		

	

}
