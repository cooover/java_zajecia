package dzien2;

import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class J20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		input.useLocale(Locale.US);
		double a;
		double b;
		double c;
		System.out.println("Podaj pierwsz� liczb�: ");
		a = input.nextDouble();
		System.out.println("Podaj drug� liczb�: ");
		b = input.nextDouble();
		System.out.println("Podaj trzeci� liczb�: ");
		c = input.nextDouble();
		System.out.println("�rednia z liczb: "+a+" "+b+" "+c+" wynosi: "+Math.round(((a+b+c)/3)*100)/100d);
		input.close();
	}

}