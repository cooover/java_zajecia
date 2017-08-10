package J65;

import java.util.ArrayList;

import gatunki.Gatunek;

public class Magazyn {
	private String nazwa;
	private int cena, ilosc;
	public int id=1;
	
	static ArrayList<Magazyn> lista = new ArrayList<>();
	
	public Magazyn() {
		super();
	}
	public Magazyn(String nazwa, int cena, int ilosc) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
		this.ilosc = ilosc;
		//lista.add(this);
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getCena() {
		return cena;
	}
	public void setCena(int cena) {
		this.cena = cena;
	}
	public int getIlosc() {
		return ilosc;
	}
	public void setIlosc(int ilosc) {
		this.ilosc = ilosc;
	}
	public void przyjmij_produkt(int ilosc) {
		this.ilosc = this.ilosc+ilosc;
	}
	public void wydaj_produkt(int ilosc) {
		this.ilosc = this.ilosc-ilosc;
	}
	public void dodajProdukt(Magazyn produkt) {
		lista.add(produkt);
	}
	public void skasujProdukt(Magazyn produkt) {
		lista.remove(produkt);
	}
	public int pokazCene() {
		return this.cena;
	}
	public void stanyProdukty(){
		for(Magazyn m1 : lista){
		System.out.println("Nazwa: " + id);
		System.out.println("Nazwa: " + m1.getNazwa());
		System.out.println("Cena: " + m1.getCena());
		System.out.println("Ilosc: " +m1.getIlosc());
		System.out.println("---------------------------------");
		}

	}
	
}
