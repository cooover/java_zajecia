package dzien4;

import java.io.FilterInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class J51 {
	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		HashMap<String, Integer> mapa = new HashMap<String, Integer>(); 
		HashSet<String> zbior = new HashSet<String>();
		mapa.put("mleko", 3);
		mapa.put("jajka", 5);
		mapa.put("chleb", 1);
		mapa.put("m¹ka", 2);
		mapa.put("cukier",3 );
		mapa.put("bu³ki", 1);
		mapa.put("pomidory", 4);
		mapa.put("woda", 1);
		mapa.put("pomarañcze", 5);
		mapa.put("ser", 3);
		System.out.println("Podaj produkt: ");
		String a = input.nextLine();
		String b;
		int suma = 0;
		while(!a.equals("koniec")) {
			if(mapa.containsKey(a)) {
				if(zbior.contains(a)) {
					System.out.println("Masz ju¿ taki produkt w koszyku, czy chcesz dodaæ? (T/N) :");
					b=input.nextLine();//to skonczylam
				}
			System.out.println("Cena: "+mapa.get(a));
			suma= suma+mapa.get(a);
			}else {
				System.out.println("Nie ma takiego produktu!");
			}
			a = input.nextLine();
		}
		System.out.println("Do zap³aty: "+suma);
		input.close();
	}
///do dokonczenia w domu 

}
