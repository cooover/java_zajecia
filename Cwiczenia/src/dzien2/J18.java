package dzien2;
import static java.lang.Math.*;
public class J18 {

	public static void main(String[] args) {
		double a = 3.0;
		double b = -5.0;
		double r = 5.5;
		System.out.println(round(sqrt(a)));//pierwiastek z 3
		System.out.println(abs(b));//wartosc bezwzgledna z -5
		System.out.println(round(pow(a,b)));//3 do potegi -5
		System.out.println(pow(a,abs(b)));//3 do potegi 5
		System.out.println(round(sqrt(abs(b))));// pierwiastek z 5
		System.out.println(round(PI* pow(r, 2)));//pole kola
		System.out.println(round(2*PI*r));//dlugosc okregu
	}

}
