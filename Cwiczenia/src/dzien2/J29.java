package dzien2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class J29 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Które zadanie chcesz wyœwietliæ? (J26, J27, J28): ");	
		String zad = input.nextLine();
		switch(zad){
		case "J26":
			input.useLocale(Locale.US);
			System.out.println("Podaj pierwsz¹ liczbê: ");	
			double liczba1 = input.nextDouble();
			input.nextLine();
			System.out.println("Jakie dzia³anie matematyczne? (+,-,/,*): ");	
			String znak = input.nextLine();
			System.out.println("Podaj drug¹ liczbê: ");	
			double liczba2 = input.nextDouble();
			switch(znak) {
			case "+":
				System.out.println("Suma = "+(liczba1+liczba2));
				break;
			case "-":
				System.out.println("Ró¿nica = "+(liczba1-liczba2));
				break;
			case "/":
				System.out.println("Iloraz = "+(liczba1/liczba2));
				break;
			case "*":
				System.out.println("Iloczyn = "+(liczba1*liczba2));
				break;
				default:
					System.out.println("Podano z³y znak");
					break;
			}
			input.close();

			break;
		case "J27":
			input.useLocale(Locale.US);
			System.out.println("Przedzia³ od: ");	
			double a = input.nextDouble();
			System.out.println("Przedzia³ do: ");	
			double b = input.nextDouble();
			if (a<=b) {
				System.out.println("Podaj liczbê: ");	
				double x = input.nextDouble();
				if(x<=b && x>=a) {
					System.out.println("Liczba znajduje siê w przedziale <"+a+";"+b+">");
				}else {
					System.out.println("Liczba nie znajduje siê w przedziale <"+a+";"+b+">");
				}
			}else {
				System.out.println("Wprowadzi³eœ z³y przedzia³.");
			}
			input.close();
			break;
		case "J28":
			System.out.println("Podaj liczbê: ");	
			int a1 = input.nextInt();
			Random gen = new Random();
			int l1 = gen.nextInt(10);
			int l2 = gen.nextInt(10);
			int l3 = gen.nextInt(10);
			System.out.println("Wylosowane liczby to: "+l1+", "+l2+", "+l3);
			if(a1<l1) {
				System.out.println("Twoja liczba jest mniejsza od pierwszej wylosowanej");
			}else if(a1>l1) {
				System.out.println("Twoja liczba jest wiêksza od pierwszej wylosowanej");
			}else {
				System.out.println("Twoja liczba jest taka sama jak pierwsza wylosowana");
			}
			if(a1<l2) {
				System.out.println("Twoja liczba jest mniejsza od drugiej wylosowanej");
			}else if(a1>l2) {
				System.out.println("Twoja liczba jest wiêksza od drugiej wylosowanej");
			}else {
				System.out.println("Twoja liczba jest taka sama jak druga wylosowana");
			}
			if(a1<l3) {
				System.out.println("Twoja liczba jest mniejsza od trzeciej wylosowanej");
			}else if(a1>l3) {
				System.out.println("Twoja liczba jest wiêksza od trzeciej wylosowanej");
			}else {
				System.out.println("Twoja liczba jest taka sama jak trzecia wylosowana");
			}
			input.close();
			break;
		default:
			System.out.println("Podano z³y znak");
			break;
		}

	}

}
