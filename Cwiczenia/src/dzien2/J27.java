package dzien2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class J27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		input.useLocale(Locale.US);
		/*System.out.println("Podaj liczb�: ");	
		double a = input.nextDouble();
		if(a<=1 && a>=0) {
			System.out.println("Liczba znajduje si� w przedziale <0,1>");
		}else {
			System.out.println("Liczba nie znajduje si� w przedziale <0,1>");
		}*/
		System.out.println("Przedzia� od: ");	
		double a = input.nextDouble();
		System.out.println("Przedzia� do: ");	
		double b = input.nextDouble();
		if (a<=b) {
			System.out.println("Podaj liczb�: ");	
			double x = input.nextDouble();
			if(x<=b && x>=a) {
				System.out.println("Liczba znajduje si� w przedziale <"+a+";"+b+">");
			}else {
				System.out.println("Liczba nie znajduje si� w przedziale <"+a+";"+b+">");
			}
		}else {
			System.out.println("Wprowadzi�e� z�y przedzia�.");
		}
		input.close();

	
	}
}
