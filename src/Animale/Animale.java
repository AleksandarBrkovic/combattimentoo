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
		this.setVelocità(velocità);
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
	public double CalcoloVolume() {
		return this.altezza*this.lunghezza*this.larghezza;	 
	}

	public void setVelocità(double velocità) {
		this.velocità = velocità;
	}
}
