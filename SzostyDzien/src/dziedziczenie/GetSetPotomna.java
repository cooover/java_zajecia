package dziedziczenie;

public class GetSetPotomna extends GetSetBazowa {
	int rok=1900;
	int miesiac;
	
	public GetSetPotomna(String imie, int pesel, int rok) {
		super(imie, pesel);
		this.rok = rok;
	}
	public GetSetPotomna(int pesel, int rok) {
		super(pesel);
		this.imie = "Anonim";
		this.rok = rok;
		this.miesiac = 8;
	}

	public static void main(String[] args) {
		GetSetPotomna gs1 = new GetSetPotomna("Micha³",78548686,2000);
		System.out.println(gs1.getImie()+" "+gs1.getPesel());
		// gs1.imie = "abc";  nie moge tak zrobic ze wzgledu na specyfikator privates
		gs1.setImie("imie");
		gs1.setPesel(12345);
		System.out.println(gs1.getImie()+" "+gs1.getPesel());
		System.out.println(gs1.getImie()+" "+gs1.getPesel()+" "+gs1.rok);
		gs1.rok = 2001;
		System.out.println(gs1.getImie()+" "+gs1.getPesel()+" "+gs1.rok);
		//gs1.infoBaza(); tez nie jest widoczna z uwagi na specyfikator dostepu
		GetSetPotomna gs2 = new GetSetPotomna(78548686,2000);
		System.out.println(gs2.getImie()+" "+gs2.getPesel()+" "+gs2.rok +" "+gs2.miesiac);

	}

}
