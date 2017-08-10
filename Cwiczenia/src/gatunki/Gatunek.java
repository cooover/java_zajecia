package gatunki;

import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/* 
1)Stw�rz program Gatunki w kt�rym b�dzie utworzonych kilka obiekt�w typu Gatunek

Klasa Gatunek powinna zawiera� pola przechowuj�ce:
	nazw� rodzaju
	nazw� gatunkow�
	liczb� chromosom�w

Opis metody:
	podaj�c� pe�n� nazw� (Rodzaj + gatunek)
	podaj�c� liczb� chromosom�w
	wypisuj�c� wszystkie dane Gatunek o warto�ciach p�l takich samych jak w obiekcie, w kt�rym zosta�a wywo�ana.

W programie powinny by� u�yte wszystkie metody.

3)Zmodyfikuj program Gatunki tak aby:
	u�ytkownik mia� mo�liwo�� wprowadzania nowych gatunk�w
	wprowadza� dane (gatunki, ich parametry, ��cznie z chromosomami)
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
			chromosomy = chromosomy + "chromosom: "+(i+1)+"\td�ugo��: "+this.tabChromosomow[i].dlRamion+"\n";
		}
		return chromosomy;
	}
	
	public String printPelnaNazwa() {
		return "Rodzaj: "+this.nazwaRodzaju + " Gatunek: "+this.nazwaGatunku;
	}
	
	public String printLiczbaChromosomwo() {
		return "Liczba chromosom�w: "+this.liczbaChromosomow;
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
		Gatunek orzelBielik = new Gatunek("bielik","orze�",3);
		Gatunek orzelPrzedni = new Gatunek("przedni","orze�",2);
		Gatunek orzelBielik2 = new Gatunek("bielik2","orze�",4);
		Gatunek orzelBielik3 = new Gatunek("bielik3","orze�",2);
		Gatunek kot = new Gatunek("kot","europejski",2);
		orzelBielik.wypiszGatunki();
		System.out.println(orzelBielik.wszystkieDane());
		kot.wypiszGatunki();
		
		String odp="T";
		while(!odp.equals("N")){
				System.out.println("Czy chcesz wprowadzi� gatunek? (T/N): ");
				odp=input.nextLine();
				while(!odp.equals("T")) {
					System.out.println("Wprowadzono z�y znak! Mo�esz wpisa� \"T\" lub \"N\". Czy chcesz wprowadzi� nowy gatunek?: ");
					odp=input.nextLine();
				}
				System.out.println("Podaj nazw� obiektu: ");
				String obiekt =input.nextLine();
				System.out.println("Podaj gatunek obiektu o nazwie " +obiekt+": ");
				String gat=input.nextLine();
				System.out.println("Podaj rodzaj obiektu o nazwie " +obiekt+": ");
				String rodz = input.nextLine();
				System.out.println("Podaj liczb� chromosom�w obiektu o nazwie " +obiekt+": ");
				int liczba = input.nextInt();
				
			//	Gatunek obiekt = new Gatunek(gat,rodz,liczba);
				
					
		}
		input.close();
	}
}



