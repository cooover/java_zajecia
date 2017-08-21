package j89;
/* Napisz metod�, kt�ra jako parametr b�dzie przyjmowa�a napis i wypisywa�a na standardowe wyj�cie jego d�ugo��.
�Przeka� do tej metody null i zobacz, jaki wyj�tek zosta� zg�oszony.
�Otocz wywo�anie metody blokiem try-catch, przechwy� ten wyj�tek i wypisz �null exception� */

public class J89 {

	public static void testString(String s) {
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Nie mo�na poda� d�ugo�ci dla napisu - zosta� przekazany null");
		}
	}
	public static void main(String[] args) {
		testString("test");
		testString(null);

		


	}

}
