package j71;

public class KontoBank1 extends KontoBankowe{

	float odsetki;
	@Override
	public void interest() {
		System.out.println("Nr rachunku: "+nrKonta+", saldo: "+saldo);
	}

	@Override
	public void addDebit() {
		System.out.println("Nie uznajemy kart debetowych");
		
	}

	
}
