package J55;

public class CalcTest {

	public static void main(String[] args) {
		Calculator suma = new Calculator();
		System.out.println(suma.dodaj(1,2));
		suma.printType(suma.dodaj(1,2));
		System.out.println(suma.dodaj(1.3,3.4));
		suma.printType(suma.dodaj(1.3,3.4));
		System.out.println(suma.odejmij(1,2,3));
		suma.printType(suma.odejmij(1,2,3));
		System.out.println(suma.odejmij(5.4,2.3,4.5));
		suma.printType(suma.odejmij(5.4,2.3,4.5));

	}

}
