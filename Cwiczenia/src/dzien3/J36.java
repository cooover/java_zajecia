package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Podaj liczb�: ");
		int liczba = input.nextInt();
		int suma = liczba;
		while(liczba!=0) {
			liczba = input.nextInt();
			suma=suma+liczba;			
		}
		System.out.println("Suma = "+suma);
		input.close();
	}
}