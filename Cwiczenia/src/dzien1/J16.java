package dzien1;
import java.util.Random;

public class J16 {

	public static void main(String[] args) {
		Random gen = new Random();
		int x = gen.nextInt(10) ;
		int y = gen.nextInt(10) ;
		boolean result;
		System.out.println(x+" "+y);
		result = x>y;
		System.out.println(result);
		result = 2*x>y ;
		System.out.println(result);
		result = y<x+3 && y>x-2;
		System.out.println(result);
		result = (x*y)%2==0;
		System.out.println(result);
	
	}

}
