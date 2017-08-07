package dzien2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class J26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		input.useLocale(Locale.US);
		System.out.println("Podaj pierwsz� liczb�: ");	
		double liczba1 = input.nextDouble();
		input.nextLine();
		System.out.println("Jakie dzia�anie matematyczne? (+,-,/,*): ");	
		String znak = input.nextLine();
		System.out.println("Podaj drug� liczb�: ");	
		double liczba2 = input.nextDouble();
		switch(znak) {
		case "+":
			System.out.println("Suma = "+(liczba1+liczba2));
			break;
		case "-":
			System.out.println("R�nica = "+(liczba1-liczba2));
			break;
		case "/":
			System.out.println("Iloraz = "+(liczba1/liczba2));
			break;
		case "*":
			System.out.println("Iloczyn = "+(liczba1*liczba2));
			break;
			default:
				System.out.println("Podano z�y znak");
				break;
		}
		input.close();

	}

}
