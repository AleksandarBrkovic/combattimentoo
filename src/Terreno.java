
public class Terreno {
	protected String TipoDiTerreno;
	
	public Terreno() {
		TipoDiTerreno="PIANURA";	
	}
	
	public Terreno( String tdt) {
		tdt= TipoDiTerreno;
	}

	public String getTipoDiTerreno() {
		return TipoDiTerreno;
	}

	public void setTipoDiTerreno(String tipoDiTerreno) {
		TipoDiTerreno = tipoDiTerreno;
	}
	public void bonusTerreno() {
		
	}
	
}
