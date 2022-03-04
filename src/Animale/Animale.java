package Animale;

public class Animale {
	private double velocità;
	protected double forza;
	protected int vita;
	protected int energia;
	protected double attacco;
	protected double difesa;
	protected double danni;
	protected int altezza;
	protected int lunghezza;
	protected int larghezza;
	protected double peso;

	
	public Animale(double velocità, double forza, int vita, int energia, double attacco, double difesa, double danni,
			int altezza, int lunghezza, int larghezza, double peso) {
		super();
		this.velocità= velocità;
		this.forza = forza;
		this.vita = vita;
		this.energia = energia;
		this.attacco = attacco;
		this.difesa = difesa;
		this.danni = danni;
		this.altezza = altezza;
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
		this.peso = peso;
	}
	public Animale() {
		
		
	}

	
	public void stampaStats() {
		System.out.println("Sono un "+ this.getClass().getSimpleName());
		
		System.out.println("Velocità: "+this.velocità);
		System.out.println("Forza: "+this.forza);
		System.out.println("Vita: "+this.vita);
		System.out.println("Energia: "+this.energia);
		System.out.println("Attacco: "+this.attacco);
		System.out.println("Difesa: "+this.difesa);
		System.out.println("Danni: "+this.danni);
		System.out.println("Altezza: "+this.altezza);
		System.out.println("Lunghezza: "+this.lunghezza);
		System.out.println("Larghezza: "+this.larghezza);
		System.out.println("Peso: "+this.peso);
		
	}
	public Animale RandomAnimale() {
		
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

	public void setForza(double forza) {
		this.forza = forza;
	}


	public void setDifesa(double difesa) {
		this.difesa = difesa;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getVelocità() {
		return velocità;
	}

	public void setVelocità(int velocità) {
		this.velocità = velocità;
	}

	public double getForza() {
		return forza;
	}

	public void setForza(int forza) {
		this.forza = forza;
	}

	public int getVita() {
		return vita;
	}

	public void setVita(int vita) {
		this.vita = vita;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public double getAttacco() {
		return attacco;
	}

	public void setAttacco(double attacco) {
		this.attacco = attacco;
	}

	public double getDifesa() {
		return difesa;
	}

	public void setDifesa(int difesa) {
		this.difesa = difesa;
	}

	public double getDanni() {
		return danni;
	}

	public void setDanni(double d) {
		this.danni = d;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public void attacco(Animale a1) {
		
	}
	public void attaccoSpeciale(Animale a1)  {
		
	}
	public void abilità(Animale a1) {
		
	}	
	public void setVelocità(double velocità) {
		this.velocità = velocità;
	}
	public double CalcoloVolume() {
		return this.altezza*this.lunghezza*this.larghezza;	 
	}
	
	
	

}
