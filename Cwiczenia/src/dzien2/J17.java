package dzien2;

import java.math.BigDecimal;
//import java.math.BigInteger;

public class J17 {

	public static void main(String[] args) {
		BigDecimal a =  new BigDecimal("3024691357530864691375308691353086445.56");
		BigDecimal b =  new BigDecimal("1512345678765432345687654345676543222.78");
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
		System.out.println(a.divide(b));

	}

}
