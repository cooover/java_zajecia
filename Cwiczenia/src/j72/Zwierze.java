package j72;

public class Zwierze extends Organizm{

	int liczbaNog = 4;
	
	public String przypiszDna(String dna) {
		super.przypiszDna(dna);
		return "przypisano DNA: "+dna;
	}
	
	public void zmienNogi(int ilosc){
		this.liczbaNog = ilosc;
	}
	
	public void eat(Organizm o) {
		if(o instanceof Roslina) {
			System.out.println("Zwierzak zjada ro�lin�");
		}else if(o instanceof Zwierze) {
			System.out.println("Zwierz�ta walcz�");
		}else if(o instanceof Bakteria) {
			System.out.println("Zwierzak jest chory");
		}
		
	}
	
	@Override
	public void info() {
		System.out.println("DNA: "+dna+", liczba n�g: "+liczbaNog);
		
	}

}
