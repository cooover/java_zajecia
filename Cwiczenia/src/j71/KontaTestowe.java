package j71;

public class KontaTestowe {

	public static void main(String[] args) {
		KontoBank1 k1 = new KontoBank1();	
		k1.addKonto(456.5f);
		k1.addSaldo(2000);
		k1.interest();
		k1.addDebit();
		
		KontoBank1 k3 = new KontoBank1();	
		k3.addKonto(45);
		k3.addSaldo(20400);
		k3.interest();
		
		KontoBank2 k2 = new KontoBank2();		
		k2.addKonto(4);
		k2.addSaldo(2000);
		k2.interest();
		
	//	KontoBankowe k = new KontoBank1();

	}

}
