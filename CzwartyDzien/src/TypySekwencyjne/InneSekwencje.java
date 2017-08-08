package TypySekwencyjne;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.*; //mozan importowac tez w ten sposob

public class InneSekwencje {

	public static void main(String[] args) {
		ArrayList<String> lista1 = new ArrayList<String>();
		lista1.add("Ala");
		lista1.add("Ola");
		lista1.add("Ala");
		
		for(String i:lista1) {
			System.out.print(i+", ");
		}
		System.out.println("\n"+lista1.size());
		lista1.remove(1);
		System.out.println(lista1);
		lista1.remove("Ala");
		System.out.println(lista1);
		lista1.set(0,"Ela");
		System.out.println(lista1);
		lista1.add("Ola");
		System.out.println(lista1);
		lista1.add(1,"Ula");
		System.out.println(lista1);
		
		// Zbiory
		
		HashSet<Integer> zbior = new HashSet<Integer>();
		zbior.add(2);
		zbior.add(5);
		zbior.add(1);
		zbior.add(1);
		HashSet<Integer> zbior2 = new HashSet<Integer>();
		zbior2.addAll(zbior);
		System.out.println(zbior);
		System.out.println(zbior2);
		HashSet<String> zbior3 = new HashSet<String>();
		zbior3.add("ciekawe");
		zbior3.add("czy");
		zbior3.add("posortuje");
		zbior3.add("alfabetycznie");
		zbior3.add("abc");
		zbior3.add("a");
		System.out.println(zbior3);
		System.out.println(zbior3.contains("posortuje"));
		System.out.println(zbior3.contains("sortuje"));
		System.out.println(zbior3.size());
		System.out.println(zbior3.remove("a"));
		System.out.println(zbior3);
		zbior3.clear();
		System.out.println(zbior3.isEmpty());
		
		// Mapy
		
		HashMap<Integer, String> mapa = new HashMap<Integer, String>(); 
		mapa.put(10, "dziesiêæ");
		mapa.put(14, "czternaœcie");
		mapa.put(15, "piêtnaœcie");
		System.out.println(mapa.get(10));
		System.out.println(mapa.get(11));
		System.out.println(mapa.keySet());
		System.out.println(mapa.values());
		mapa.remove(10,"dziesiêæ");
		System.out.println(mapa);
		mapa.clear();
		System.out.println(mapa.size());
		
		// Kolejki
		ArrayDeque<String> stos = new ArrayDeque<String>();
		stos.add("napis1");
		stos.add("napis2");
		stos.add("napis3");
		System.out.println(stos);
		stos.addLast("napis koñcowy");
		stos.addFirst("Napis pocz¹tkowy");
		System.out.println(stos);
		String a = stos.poll(); // pobiera poczatkowy i usuwa
		System.out.println(a);
		String b = stos.getLast(); //pobiera koncowy, nie usuwa
		System.out.println(b);
		System.out.println(stos);
		stos.remove("napis3");
		System.out.println(stos);
		
	}

}
