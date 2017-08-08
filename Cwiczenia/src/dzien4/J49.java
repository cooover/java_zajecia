package dzien4;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class J49 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		ArrayList<String> lista = new ArrayList<String>();
		System.out.println("Podaj napis: ");
		String a = input.nextLine();
		while(!a.equals("end")) {
			lista.add(a);	
			a = input.nextLine();
		}
		System.out.println(lista);
		input.close();

	}

}
