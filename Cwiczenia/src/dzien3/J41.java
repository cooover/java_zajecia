package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J41 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Podaj liczbê: ");
		int liczba = input.nextInt();
		if(liczba>0) {
			for(int i = 1; i<liczba+1; i++ ) {
				if(liczba%i==0) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("Liczba mniejsza od 0");
		}
		input.close();
	}

}
