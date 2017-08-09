package J52;

public class Employee {
	String imie, nazwisko,rok;
	int staz;
	
	Employee(String imie, String nazwisko, String rok, int staz){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rok = rok;
		this.staz = staz;
	}
	public String wyswietl() {
		return "Imiê: "+imie+", Nazwisko: "+nazwisko+", Rok urodzenia: "+rok+", Sta¿ pracy: "+staz;
	}

}
