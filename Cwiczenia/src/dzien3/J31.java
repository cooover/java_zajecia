package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J31 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Wprowadz pierwszy napis : ");
		String l1 = input.nextLine();
		System.out.println("Wprowadz drugi napis : ");
		String l2 = input.nextLine();
		char separator = l2.charAt(l2.length()-3);
		String s = String.valueOf(separator);
		String[] tablica = l1.split(s);
		for(String v:tablica) {
			System.out.print(v+" ");
		input.close();
		}
	}

}
