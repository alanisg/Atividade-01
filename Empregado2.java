
public class Empregado2 extends Empregado{
	private double salario;
	private double ValorAReceber;
	private double PercentualComissao;
	
	public Empregado2(int tipo) {
		super (tipo);
		this.salario = 0;
		this.PercentualComissao = 0;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = 1500 + gerador.nextDouble() * 500;
	}

	public double getValorAReceber() {
		return ValorAReceber;
	}

	public void setValorAReceber(double PercentualComissao, double salario) {
		ValorAReceber = salario+salario*PercentualComissao;
	}

	public double getPercentualComissao() {
		return PercentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		this.PercentualComissao = gerador.nextDouble();
	}
	
}
