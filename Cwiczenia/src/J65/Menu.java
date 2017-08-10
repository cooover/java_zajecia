package J65;

public class Menu {

	public static void main(String[] args) {
		Magazyn m1 = new Magazyn("Komputer",5000,50);
		m1.dodajProdukt(m1);
		m1.stanyProdukty();
		m1.wydaj_produkt(15);
		m1.stanyProdukty();
		m1.przyjmij_produkt(25);
		m1.stanyProdukty();
		
		Magazyn m2 = new Magazyn("Myszka",30,15);
		m2.dodajProdukt(m2);
		
		System.out.println("");
		System.out.println("1. WSZYSTKO:");
		System.out.println("");
		
		m2.stanyProdukty();
		m1.skasujProdukt(m1);
		System.out.println("");
		System.out.println("2. WSZYSTKO:");
		System.out.println("");
		
		m2.stanyProdukty();
	}

}
