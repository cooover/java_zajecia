package j72;

public abstract class Organizm {
	
	String dna;
	
	public String przypiszDna(String dna) {
		this.dna = dna;
		return dna;
	}
	
	public abstract void info();

}
