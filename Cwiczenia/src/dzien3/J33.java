package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J33 {
	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Podaj napis: ");
		String napis = input.nextLine();
		String[] tab = new String[napis.length()];
		for(int i = 0; i<=(napis.length()-1); i++) {
			String s = String.valueOf(napis.charAt(i));
			tab[i]= s;
		}for(String v:tab) {
			System.out.print(v);
		}
		System.out.println();
		System.out.println("Podaj liczb�: ");
		int liczba = input.nextInt();
		int i;
		for(i=0; i<=(napis.length()-1);i=i+liczba){
			System.out.print(napis.charAt(i));
		input.close();
		}
	}
}
