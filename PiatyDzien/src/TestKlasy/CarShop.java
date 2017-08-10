package TestKlasy;

public class CarShop{

	public static void main(String[] args) {
		CarShop cs = new CarShop();
		System.out.println("Kupujemy auto: ");
		Auto bmw = new Auto(4,"bia³y","z³oty","chrome","BMW","X5",100000);
		System.out.println("Kupi³eœ: "+bmw.marka+" "+bmw.model+" ");
		System.out.println("Do zap³aty: "+bmw.cena);
		boolean res = bmw instanceof Auto;
		boolean res2 = cs instanceof CarShop;
		System.out.println(res+" "+res2);
		
		/* double cena_brutto_rabat = bmw.brutto();
		System.out.println("Po rabacie:");
		System.out.println(cena_brutto_rabat); */
		
		System.out.println(bmw.brutto());
		bmw.bruttoNetto();
		System.out.println(bmw.brutto);

		System.out.println("Po rabacie:");
		bmw.rabat();
		bmw.bruttoNetto();

	}

}
