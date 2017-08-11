package jJ67;

public class Testowa {

	public static void main(String[] args) {
		Tyre t1 = new Tyre("Zimowa","Michelin","M123",18,60,155);
		System.out.println(t1.NR+" "+t1.nazwa+" "+t1.model+" "+t1.seria+" "+t1.wysokosc+" "+t1.szerokosc+" "+t1.rozmiar);
		
		Wheel w1 = new Wheel("Super felga","BBS","BBS123",18);
		System.out.println(w1.NR+" "+w1.nazwa+" "+w1.model+" "+w1.seria+" "+w1.cale);
		
		ExhaustPart e1 = new ExhaustPart("Kopciuch","ABC","S3",false);
		System.out.println(e1.NR+" "+e1.nazwa+" "+e1.model+" "+e1.seria+" "+e1.standard);

	}

}
