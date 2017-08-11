package jJ67;

public class Tyre extends Part{
	int rozmiar, szerokosc, wysokosc;
	
	public Tyre(String nazwa, String model, String seria, int rozmiar, int szerokosc, int wysokosc) {
		super(nazwa, model, seria);
		this.rozmiar = rozmiar;
		this.szerokosc = szerokosc;
		this.wysokosc = wysokosc;
	}

}
