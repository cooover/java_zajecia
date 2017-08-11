package j72;

public class Bakteria extends Organizm{

	String szkodliwosc;
	
	public String przypiszDna(String dna) {
		super.przypiszDna(dna);
		return "przypisano DNA: "+dna;
	}
	
	public void zmienSzkodliwosc(String szkodliwosc) {
		this.szkodliwosc = szkodliwosc;
	}
	@Override
	public void info() {
		System.out.println("DNA: "+dna+", szkodliwoœæ: "+szkodliwosc);
		
	}

}
