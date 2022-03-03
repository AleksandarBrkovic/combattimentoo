package Animale;

public class Animale {
	private double velocitÓ;
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

	
	public Animale(double velocitÓ, double forza, int vita, int energia, double attacco, double difesa, double danni,
			int altezza, int lunghezza, int larghezza, double peso) {
		super();
		this.setVelocitÓ(velocitÓ);
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
	public void stampaStats() {
		System.out.println("Sono un "+ this.getClass().getSimpleName());
		
		System.out.println("VelocitÓ: "+this.velocitÓ);
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

	public double getVelocitÓ() {
		return velocitÓ;
	}

	public void setVelocitÓ(int velocitÓ) {
		this.velocitÓ = velocitÓ;
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
	public void abilitÓ(Animale a1) {
		
	}	
	public void setVelocitÓ(double velocitÓ) {
		this.velocitÓ = velocitÓ;
	}
	public double CalcoloVolume() {
		return this.altezza*this.lunghezza*this.larghezza;	 
	}
	
	

}
