package j72;

public class Testowa {

	public static void main(String[] args) {
		Bakteria b = new Bakteria();
		b.przypiszDna("sdfd");
		b.szkodliwosc = "du¿a";
		b.info();
		b.zmienSzkodliwosc("œrednia");
		b.info();
		
		System.out.println("");
		
		Zwierze z = new Zwierze();
		z.przypiszDna("ghjk");
		z.liczbaNog = 4;
		z.info();
		z.zmienNogi(3);
		z.info();
		
		System.out.println("");
		
		Roslina r = new Roslina();
		r.przypiszDna("ghdsak");
		r.dlLodygi = 5;
		r.info();
		r.zmienDlLodygi(3);
		r.info();
		
		z.eat(r);
		z.eat(b);
		z.eat(z);
	
	}

}
