package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Ile masz lat?: ");
		int wiek = input.nextInt();
		if(wiek>=18){
			System.out.println("Mo�esz g�osowa�!");
		}else{
			System.out.println("Nie mo�esz g�osowa�!");
		}
		input.close();
	}

}
