package pierwszapaczka;

public class TestKon {

	public static void main(String[] args) {
		double number1 = 10.987;
		int number2 = 5;
		float number3 = 10.789f;
		int narrowing = (int)number1;
		double widening = (double)number2;
		System.out.println("Narrowing: "+narrowing);
		System.out.println("Widening: "+widening);
		long c = Math.round(number3);
		System.out.println(c);
		String ala = "Ala";
		String ala2 = "Ala";
		String al = "Al";
		String a = "a";
		String ala3 = al+a;
		String kot = "Kot";
		System.out.println(ala==ala3);
		System.out.println(ala.equals(ala3)); //jezeli porownujemy ciag znakow albo obiekty to stusujemy equals chyba

	}

}
