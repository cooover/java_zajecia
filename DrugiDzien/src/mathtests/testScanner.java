package mathtests;

import java.io.FilterInputStream;
import java.util.Scanner;

public class testScanner {
	
	public static void main(String[] args) {
		String imie;
		System.out.println("Jak masz na imi�?");
		Scanner odczyt = new Scanner(new FilterInputStream(System.in){
			@Override
			public void close() {};
		});
		imie = odczyt.nextLine();
		System.out.println("Witaj "+imie);
		odczyt.close();
		Scanner odczyt2 = new Scanner(System.in);
		String imie2 = odczyt2.nextLine();
		System.out.println("Witaj "+imie2);
		odczyt2.close();
	}

}
