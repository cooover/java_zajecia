package dzien2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class J22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		input.useLocale(Locale.US);
		System.out.println("Podaj d�ugo�� boku: ");
		double x = input.nextDouble();
		System.out.println("Pole sze�ciok�ta foremnego o boku d�ugo�ci "+x+" wynosi "+ (Math.round((3*Math.pow(x,2)* Math.sqrt(3)/2)*100)/100d));
		input.close();
	}

}
