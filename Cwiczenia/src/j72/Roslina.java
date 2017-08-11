package j72;

public class Roslina extends Organizm {

	int dlLodygi;
	
	public String przypiszDna(String dna) {
		super.przypiszDna(dna);
		return "przypisano DNA: "+dna;
	}
	
	public void zmienDlLodygi(int dl) {
		this.dlLodygi = dl;
	}
	@Override
	public void info() {
		System.out.println("DNA: "+dna+", d³ugoœæ ³odygi: "+dlLodygi);
		
	}

}
