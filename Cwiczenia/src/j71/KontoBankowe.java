package j71;

public abstract class KontoBankowe {

	public static int nrKonta;
	public float saldo;
	
	public void addSaldo(float saldo) {
		this.saldo = this.saldo +saldo;
	}
	public void subbSaldo(float saldo) {
		this.saldo = this.saldo -saldo;
		
	}
	public void addKonto(float saldo) {
		++this.nrKonta;
		this.saldo = saldo;
	}
	public abstract void interest();
	public abstract void addDebit();
}
