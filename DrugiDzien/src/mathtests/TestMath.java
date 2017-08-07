package mathtests;

import static java.lang.Math.*;

import java.math.BigInteger;

public class TestMath {

	public static void main(String[] args) {
		int x = 5;
		double y = 9.0;
		long i = 8345678978066890578l;
		long j = 8345678978066890578l;
		BigInteger bigIntJ = BigInteger.valueOf(j);
		//BigInteger bigBigInt = new BigInteger("23456787534567887645674567856788765456787645677654567777777");
		BigInteger bigBigInt = new BigInteger("9876543234567898765434568765434567898765234567898765345678765423456765423456776");
		BigInteger bigIntI = BigInteger.valueOf(i);
		System.out.println(bigIntJ.toString());
		System.out.println(bigIntI.toString());
		BigInteger temp = bigIntJ.add(bigIntI);
		System.out.println(temp.toString());
		System.out.println(bigBigInt.toString());
		/*double pierwiastek = Math.sqrt(y);
		double potega = Math.pow(y, x);*/
		double pierwiastek = sqrt(y);
		double potega = pow(y, x);
		System.out.println("Pierwiastek z "+y+" wynosi: "+pierwiastek);
		System.out.println("Liczba  "+y+" podniesiona po potêgi "+x+" wynosi: "+potega);

	}

}
