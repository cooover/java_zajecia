package gatunki;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* 
1)Stwórz program Gatunki w którym bêdzie utworzonych kilka obiektów typu Gatunek

Klasa Gatunek powinna zawieraæ pola przechowuj¹ce:
	nazwê rodzaju
	nazwê gatunkow¹
	liczbê chromosomów

Opis metody:
	podaj¹c¹ pe³n¹ nazwê (Rodzaj + gatunek)
	podaj¹c¹ liczbê chromosomów
	wypisuj¹c¹ wszystkie dane Gatunek o wartoœciach pól takich samych jak w obiekcie, w którym zosta³a wywo³ana.

W programie powinny byæ u¿yte wszystkie metody.

3)Zmodyfikuj program Gatunki tak aby:
	u¿ytkownik mia³ mo¿liwoœæ wprowadzania nowych gatunków
	wprowadza³ dane (gatunki, ich parametry, ³¹cznie z chromosomami)
*/

public class Gatunek {
	String nazwaGatunku, nazwaRodzaju;
	int liczbaChromosomow;
	Chromosom[] tabChromosomow;
	
	static ArrayList<Gatunek> listaGatunkow = new ArrayList<>();
	
	public Gatunek(String nazwaGatunku, String nazwaRodzaju, int liczbaChromosomow) {
		super();
		this.nazwaGatunku = nazwaGatunku;
		this.nazwaRodzaju = nazwaRodzaju;
		this.liczbaChromosomow = liczbaChromosomow;
		this.liczbaChromosomow = liczbaChromosomow;
		this.tabChromosomow = new Chromosom[liczbaChromosomow];
		Random gen = new Random();
		for(int i =0; i<tabChromosomow.length; i++) {
			tabChromosomow[i] = new Chromosom(i+1, gen.nextInt(50));
		}
		listaGatunkow.add(this);
	}
	
	public String printChromosomy() {
		String chromosomy = "";
		for(int i=0;i<this.tabChromosomow.length; i++) {
			chromosomy = chromosomy + "chromosom: "+(i+1)+"\td³ugoœæ: "+this.tabChromosomow[i].dlRamion+"\n";
		}
		return chromosomy;
	}
	
	public String printPelnaNazwa() {
		return "Rodzaj: "+this.nazwaRodzaju + " Gatunek: "+this.nazwaGatunku;
	}
	
	public String printLiczbaChromosomwo() {
		return "Liczba chromosomów: "+this.liczbaChromosomow;
	}
	
	public String wszystkieDane() {
		return this.printPelnaNazwa()+"\n"+this.printLiczbaChromosomwo()+"\n"+this.printChromosomy();
	}
	
	public void wypiszGatunki() {
		for(Gatunek v:listaGatunkow) {
			if(v.nazwaRodzaju.equals(this.nazwaRodzaju)) {
				System.out.println(v.wszystkieDane()+"\n\n");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		Gatunek orzelBielik = new Gatunek("bielik","orze³",3);
		Gatunek orzelPrzedni = new Gatunek("przedni","orze³",2);
		Gatunek orzelBielik2 = new Gatunek("bielik2","orze³",4);
		Gatunek orzelBielik3 = new Gatunek("bielik3","orze³",2);
		Gatunek kot = new Gatunek("kot","europejski",2);
		orzelBielik.wypiszGatunki();
		System.out.println(orzelBielik.wszystkieDane());
		kot.wypiszGatunki();
		
		String odp="T";
		while(!odp.equals("N")){
				System.out.println("Czy chcesz wprowadziæ gatunek? (T/N): ");
				odp=input.nextLine();
				while(!odp.equals("T")) {
					System.out.println("Wprowadzono z³y znak! Mo¿esz wpisaæ \"T\" lub \"N\". Czy chcesz wprowadziæ nowy gatunek?: ");
					odp=input.nextLine();
				}
				System.out.println("Podaj nazwê obiektu: ");
				String obiekt =input.nextLine();
				System.out.println("Podaj gatunek obiektu o nazwie " +obiekt+": ");
				String gat=input.nextLine();
				System.out.println("Podaj rodzaj obiektu o nazwie " +obiekt+": ");
				String rodz = input.nextLine();
				System.out.println("Podaj liczbê chromosomów obiektu o nazwie " +obiekt+": ");
				int liczba = input.nextInt();
				
			//	Gatunek obiekt = new Gatunek(gat,rodz,liczba);
				
					
		}
		input.close();
	}
}



