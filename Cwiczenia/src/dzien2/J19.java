package dzien2;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		String imie;
		System.out.println("Podaj imi�: ");
		imie = input.nextLine();
		System.out.println("Witaj "+imie+" na kursie Javy!");
		input.close();
	}

}