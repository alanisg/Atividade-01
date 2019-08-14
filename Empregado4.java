
public class Empregado4 extends Empregado{
	private double bonus;
	
	public Empregado4(int tipo) {
		super(tipo);
		this.bonus = 0;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = 2000 + gerador.nextDouble() * 2000;
	}

	public double getValorAReceber() {
		return bonus;
	}
	
}
