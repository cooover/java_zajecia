package J52;

import java.util.ArrayList;

public class Company {
	ArrayList<String> lista_pracownikow = new ArrayList<String>();
	Company(ArrayList<String> lista_pracownikow){
		this.lista_pracownikow = lista_pracownikow;
	}
	public void infoDlaSzefa() {
		for(String i:lista_pracownikow) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> pracownicy = new ArrayList<String>();
		Employee p1 = new Employee("Jan","Kowalski","1986",7);
		pracownicy.add(p1.wyswietl());
		Employee p2 = new Employee("Anna","Nowak","1971",20);
		pracownicy.add(p2.wyswietl());
		Employee p3 = new Employee("Adam","Zawadzki","1980",17);
		pracownicy.add(p3.wyswietl());
		System.out.println("PRACOWNIK NR 1");
		System.out.println(p1.wyswietl());
		System.out.println();
		System.out.println("PRACOWNIK NR 2");
		System.out.println(p2.wyswietl());
		System.out.println();
		System.out.println("PRACOWNIK NR 3");
		System.out.println(p3.wyswietl());
		System.out.println("------------------------------------------------------------------");
		System.out.println("Lista pracowników:");
		Company szef = new Company(pracownicy);
		szef.infoDlaSzefa();
	}
}
