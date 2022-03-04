package Terreno;

public class Terreno {
	protected String TipoDiTerreno;
	
	public Terreno() {
		TipoDiTerreno="PIANURA";	
	}
	
	public Terreno( String tdt) {
		tdt= TipoDiTerreno;
	}

	
	public void bonusTerreno() {
		
	}
	public void RandomTerreno() {
		Terreno t1=null;
		int z= (int) (Math.random()*3+1);
		switch(z){
			case 1:
				t1= new Terreno();
				break;
			case 2:
				t1= new Fiume();
				break;
			case 3:
				t1= new Foresta();
				break;
				default:
					
		}
	}
	public void stampaTerreno() {
		System.out.print("Luogo del combattimento: "+ this.getClass().getSimpleName());
		
		}
	
	public String getTipoDiTerreno() {
		return TipoDiTerreno;
	}

	public void setTipoDiTerreno(String tipoDiTerreno) {
		TipoDiTerreno = tipoDiTerreno;
	}
}
