package dzien2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class J21 {

	public static void main(String[] args) {
		Scanner wpisz = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		wpisz.useLocale(Locale.US);
		System.out.println("Podaj pierwsz� liczb�: ");
		double x = wpisz.nextDouble();
		System.out.println("Podaj drug� liczb�: ");
		double y = wpisz.nextDouble();
		System.out.println("Pierwsza liczba jest wi�ksza od drugiej? "+ (x>y));
		System.out.println("Pierwsza liczba jest wi�ksza lub r�wna drugiej? "+ (x>=y));
		System.out.println("Lliczby s� r�wne? "+ (x==y));
		System.out.println("Liczby s� nier�wne? "+ (x!=y));
		System.out.println("Pierwsza liczba jest mniejsza od drugiej? "+ (x<y));
		System.out.println("Pierwsza liczba jest mniejsza lub r�wna drugiej? "+ (x<=y));
		wpisz.close();
	}

}
