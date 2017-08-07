package dzien3;

import java.io.FilterInputStream;
import java.util.Scanner;

public class J30 {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		System.out.println("Podaj liczbê: ");
		int liczba = input.nextInt();
		//int i;
		while (liczba<0) {
			System.out.println("Podaj liczbê, która jest wiêksza od 0: ");
			liczba = input.nextInt();
		}
		/*
		int[] tablica = new int[liczba];
		for(int i=0; i<liczba; i++){
			tablica[i]=i+1;
		}
		for(int i=0;i<liczba;i=i+2){
			System.out.println(tablica[i]+" ");
		}*/ // tego nie trzeba
			for(int i=0;i<liczba;i=i+2){
				System.out.println(i+1+" ");
			}
		input.close();
	}
}
