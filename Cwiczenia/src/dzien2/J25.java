package dzien2;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Podaj napis: ");	
		String napis = input.nextLine();
		System.out.println(napis.length());
		input.close();
		
	}

}
