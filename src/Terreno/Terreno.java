package Terreno;

public abstract class Terreno {
	protected String TipoDiTerreno;
	
	public Terreno() {
		TipoDiTerreno="PIANURA";	
	}
	
	public Terreno( String tdt) {
		tdt= TipoDiTerreno;
	}

	
	public void bonusTerreno() {
		
	}

	
	public void stampaTerreno() {
		
		
		}
	
	public String getTipoDiTerreno() {
		return TipoDiTerreno;
	}

	public void setTipoDiTerreno(String tipoDiTerreno) {
		TipoDiTerreno = tipoDiTerreno;
	}
}
