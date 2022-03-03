import Animale.*;


public class Main {

	public static void main(String[] args) {
		Animale a1 = null;
		int z= (int) (Math.random()*6+1);
		switch(z) {
		case 1: 
			a1 = new Struzzo();
			break;
		case 2: 
			a1 = new Leone();
			break;
		case 3: 
			a1 = new Orso();
			break;
		case 4: 
			a1 = new Rapace();
			break;
		case 5: 
			a1 = new Coccodrillo();
			break;
		case 6: 
			a1 = new Serpente();
			break;
			default:
				System.out.println("ERRORE");
		}
		
	
		

	}

}
