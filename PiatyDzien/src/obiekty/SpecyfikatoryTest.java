package obiekty;
import TestKlasy.Auto;

public class SpecyfikatoryTest {
	public static void main(String[] args) {
		
		 Auto a1 = new Auto(3, "zielony", "¿ó³ty", "szary", "Audi", "A4", 10000);
		 a1.bruttoNetto();
		 GetSet gs1 = new GetSet();
		 GetSet gs2 = new GetSet(4, "napis",false);
		 System.out.println((gs1.getA()));
		 gs1.setA(15);
		 System.out.println((gs1.getA()));
		 System.out.println((gs2.getA()));
		 gs2.setA(7);
		 System.out.println((gs2.getA()));
		 System.out.println((gs2.getB()));
		 gs2.setB("zmieniony napis");
		 System.out.println((gs2.getB()));
		 System.out.println((gs2.isC()));
		 gs2.setC(true);
		 System.out.println((gs2.isC()));
		 System.out.println((gs1.getZnaczek()));
		 gs1.setZnaczek('*');
		 System.out.println((gs1.getZnaczek()));
	}

	
}
