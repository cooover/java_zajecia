package j95;
//Napisz program kalkulator który reaguje na wyj¹tki i prosi o poprawienie wpisu.
import java.io.FilterInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner input = new Scanner(new FilterInputStream(System.in) {
			@Override
			public void close() {}
		});
		Kalkulator dzialanie = new Kalkulator();
		String nav ="";
		while(true) {
			System.out.println("Co chcesz zrobic?(+,-,*,/, Q-wyjœcie): ");
			nav=input.nextLine();
				try {
					if(!(nav.equals("+") || nav.equals("-") || nav.equals("*") || nav.equals("/") || nav.equals("Q"))) {
						throw new InputMismatchException();
					}
				}catch(InputMismatchException e) {
					System.out.println("Wprowadzono z³y znak, wpisz jeszcze raz.");
				}
				if(nav.equals("+")) {
					try {
					System.out.println("Podaj piewsz¹ liczbê: ");
					dzialanie.setA(input.nextDouble());
					System.out.println("Podaj drug¹ liczbê: ");
					dzialanie.setB(input.nextDouble());
					System.out.println(dzialanie.getA()+" + "+dzialanie.getB()+" = "+dzialanie.dodawanie());
					input.nextLine();
					} catch (InputMismatchException e) {
						System.out.println("Nie wprowadzono liczby!");
						input.nextLine();
					}
				}else if(nav.equals("-")) {
					try {
					System.out.println("Podaj piewsz¹ liczbê: ");
					dzialanie.setA(input.nextDouble());
					System.out.println("Podaj drug¹ liczbê: ");
					dzialanie.setB(input.nextDouble());
					System.out.println(dzialanie.getA()+" - "+dzialanie.getB()+" = "+dzialanie.odejmowanie());
					input.nextLine();
					} catch(InputMismatchException e) {
						System.out.println("Nie wprowadzono liczby!");
						input.nextLine();
					}
				}else if(nav.equals("*")) {
					try {
					System.out.println("Podaj piewsz¹ liczbê: ");
					dzialanie.setA(input.nextDouble());
					System.out.println("Podaj drug¹ liczbê: ");
					dzialanie.setB(input.nextDouble());
					System.out.println(dzialanie.getA()+" * "+dzialanie.getB()+" = "+dzialanie.mnozenie());
					input.nextLine();
					} catch(InputMismatchException e) {
						System.out.println("Nie wprowadzono liczby!");
						input.nextLine();
					}
				}else if(nav.equals("/")) {
					try {
					System.out.println("Podaj piewsz¹ liczbê: ");
					dzialanie.setA(input.nextDouble());
					System.out.println("Podaj drug¹ liczbê: ");
					double m = input.nextDouble();
					if(m==0) {
						throw new ArithmeticException();
					}		
					dzialanie.setB(m);
					System.out.println(dzialanie.getA()+" / "+dzialanie.getB()+" = "+dzialanie.dzielenie());
					input.nextLine();
					} catch(InputMismatchException e) {
						System.out.println("Nie wprowadzono liczby!");
						input.nextLine();
					} catch(ArithmeticException e) {
						System.out.println("Nie mo¿na dzieliæ przez 0!");
						input.nextLine();
					}
				}	
				if(nav.equals("Q")) {
					System.out.println("Koniec");
					break;
				}
		}
		input.close();
	}
}



