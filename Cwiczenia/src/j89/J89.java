package j89;
/* Napisz metodê, która jako parametr bêdzie przyjmowa³a napis i wypisywa³a na standardowe wyjœcie jego d³ugoœæ.
•Przeka¿ do tej metody null i zobacz, jaki wyj¹tek zosta³ zg³oszony.
•Otocz wywo³anie metody blokiem try-catch, przechwyæ ten wyj¹tek i wypisz „null exception” */

public class J89 {

	public static void testString(String s) {
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Nie mo¿na podaæ d³ugoœci dla napisu - zosta³ przekazany null");
		}
	}
	public static void main(String[] args) {
		testString("test");
		testString(null);

		


	}

}
