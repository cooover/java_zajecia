package J54;

public class Test {

	public static void main(String[] args) {
		Operacje suma = new Operacje();
		System.out.println(suma.dodaj(1,2));
		System.out.println(suma.dodaj(1.3,4.3));
		System.out.println(suma.dodaj(1,2,3.2,4));
		System.out.println(suma.dodaj(1,2,3,4,5));
	}

}
