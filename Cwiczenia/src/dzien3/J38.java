package dzien3;

import java.io.FilterInputStream;
import java.util.Random;
import java.util.Scanner;

public class J38 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		Random gen = new Random();
		int losowa = gen.nextInt(100);
		int liczba;
		System.out.println("Podaj liczb�: ");
		do {
			liczba = input.nextInt();
			if(liczba>losowa) {
				System.out.println("Poda�e� za du�� warto��!");
			}else if(liczba<losowa){
				System.out.println("Poda�e� za ma�� warto��!");		
			}else {
				System.out.println("Gratulacje!");
			}
		}while(liczba!=losowa);
		System.out.println("Wylosowana liczba to: "+losowa);	
		input.close();
	}
}
