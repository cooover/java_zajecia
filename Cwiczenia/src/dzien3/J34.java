package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J34 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
			System.out.println("Podaj pierwsz� liczb�: ");
			int A = input.nextInt();
			System.out.println("Podaj drug� liczb�: ");
			int B = input.nextInt();
			if(A<B) {
				int suma = 0;
				while(A<=B) {
					suma = suma+A;
					A = A+1;
				}System.out.println("Suma = "+suma);
			}else
				System.out.println("Pierwsza liczba powinna by� mniejsza od drugiej");
			input.close();

	}

}
