package Petle;

import java.io.FilterInputStream;
import java.util.Scanner;

public class TestPetle {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Ile wyraz�w chcesz wypisa� ?");
		int l = input.nextInt();
		input.nextLine();
		int i;
		/*for(i=1; i<=l; i++) {
			System.out.println(i+" Witaj");
		}*/
		i = 0;
		String[] teksty = new String[l];
		for(i=1; i<=l; i++) {
			System.out.println("Podaj "+i+" napis: ");
			String napis = input.nextLine();
			teksty[i-1]=napis;
		}
		while(i>1) {
			i--;
			System.out.print(teksty[i-1]+" ");			
		}
		System.out.println();
		for(String v : teksty){
			System.out.print(v+" ");
		}
		input.close();
		/*int[] liczby = new int[3];
		String[] napisy = new String[3];
		System.out.println(liczby[0]);
		System.out.println(napisy[1]); */ // takie tablice wypelnione sa albo zerami alebuo nullami
	}

}
