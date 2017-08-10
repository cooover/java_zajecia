package J66;

public class Student {
	String imie, nazwisko;
	int nr_indeksu;
	static int id = 0;
	
	public Student(String imie, String nazwisko, int nr_indeksu) {
		id++;
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.nr_indeksu = nr_indeksu;
		if (id>=2)
			System.out.println("Mamy ju¿ "+id+" studentów.");
	}
}
