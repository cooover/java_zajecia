package dzien2;

import java.io.FilterInputStream;
//import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class J28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		//input.useLocale(Locale.US);
		System.out.println("Podaj liczb�: ");	
		int a = input.nextInt();
		Random gen = new Random();
		int l1 = gen.nextInt(10);
		int l2 = gen.nextInt(10);
		int l3 = gen.nextInt(10);
		System.out.println("Wylosowane liczby to: "+l1+", "+l2+", "+l3);
		if(a<l1) {
			System.out.println("Twoja liczba jest mniejsza od pierwszej wylosowanej");
		}else if(a>l1) {
			System.out.println("Twoja liczba jest wi�ksza od pierwszej wylosowanej");
		}else {
			System.out.println("Twoja liczba jest taka sama jak pierwsza wylosowana");
		}
		if(a<l2) {
			System.out.println("Twoja liczba jest mniejsza od drugiej wylosowanej");
		}else if(a>l2) {
			System.out.println("Twoja liczba jest wi�ksza od drugiej wylosowanej");
		}else {
			System.out.println("Twoja liczba jest taka sama jak druga wylosowana");
		}
		if(a<l3) {
			System.out.println("Twoja liczba jest mniejsza od trzeciej wylosowanej");
		}else if(a>l3) {
			System.out.println("Twoja liczba jest wi�ksza od trzeciej wylosowanej");
		}else {
			System.out.println("Twoja liczba jest taka sama jak trzecia wylosowana");
		}
		input.close();

	}

}
