package TestKlasy;

public class Auto {
	
	int iloscDrzwi;
	String kolorNadwozia, kolorFelg, kolorOpon, marka, model;
	double brutto, cena;
	
	//metoda
	public double brutto() {
		brutto = cena*1.23;
		return brutto;
	}
	public void bruttoNetto() {
		System.out.println("Do zap³aty:");
		System.out.println("cena netto: "+cena);
		System.out.println("cena brutto: "+cena*1.23);
	}
	public double rabat() {
		cena= cena*0.9;
		return cena;
	}
	
	// konstruktor (zawsze nazywa sie tak jak klasa)
	Auto(	int iloscDrzwi,  // nie trzeba rozwijac, ale tak jest bardziej widoczne
			String kolorNadwozia, 
			String kolorFelg, 
			String kolorOpon, 
			String marka, 
			String model,
			int cena){    
		this.iloscDrzwi = iloscDrzwi;
		this.kolorNadwozia = kolorNadwozia; 
		this.kolorFelg = kolorFelg;
		this.kolorOpon = kolorOpon; 
		this.marka = marka;
		this.model = model;
		this.cena = cena;
	}
/*
	public static void main(String[] args) {
		Auto garbus = new Auto(4, "niebieski", "czerwony", "czarny", "Volkswagen", "Garbus", 20000);
		// przed przypisaniem wartosci
		/*
		System.out.println(garbus.iloscDrzwi);
		System.out.println(garbus.kolorNadwozia);
		System.out.println(garbus.kolorFelg);
		System.out.println(garbus.kolorOpon);
		System.out.println(garbus.marka);
		System.out.println(garbus.model);
		// przypisanie wartosci
		garbus.iloscDrzwi = 4;
		garbus.kolorNadwozia = "niebieski";
		garbus.kolorFelg = "czerwony";
		garbus.kolorOpon = "czarny";
		garbus.marka = "Volkswagen";
		garbus.model = "Garbus";
		
		//po przypisaniu wartosci
		System.out.println("PIERWSZY OBIEKT:");
		System.out.println(garbus.iloscDrzwi);
		System.out.println(garbus.kolorNadwozia);
		System.out.println(garbus.kolorFelg);
		System.out.println(garbus.kolorOpon);
		System.out.println(garbus.marka);
		System.out.println(garbus.model);
		System.out.println(garbus.cena);
		Auto a4 = new Auto(3, "zielony", "¿ó³ty", "szary", "Audi", "A4", 10000);
		Auto bmw3 = new Auto(2, "bia³y", "ró¿owy", "br¹zowy", "BMW", "3", 30000);
		System.out.println("DRUGI OBIEKT:");
		System.out.println(a4.iloscDrzwi);
		System.out.println(a4.kolorNadwozia);
		System.out.println(a4.kolorFelg);
		System.out.println(a4.kolorOpon);
		System.out.println(a4.marka);
		System.out.println(a4.model);
		System.out.println(a4.cena);
		System.out.println("TRZECI OBIEKT:");
		System.out.println(bmw3.iloscDrzwi);
		System.out.println(bmw3.kolorNadwozia);
		System.out.println(bmw3.kolorFelg);
		System.out.println(bmw3.kolorOpon);
		System.out.println(bmw3.marka);
		System.out.println(bmw3.model);
		System.out.println(bmw3.cena);
	}
*/
}
