public class Empregado1 extends Empregado{
	
	private double salario;
	
	public Empregado1(int tipo) {
		super (tipo);
		this.salario = 0;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = 2500 + gerador.nextDouble() * 700;
	}

	public double getValorAReceber() {
		return salario;
	}
}
