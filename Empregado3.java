
public class Empregado3 extends Empregado{
	private double salario;
	private double ValorAReceber;
	private double PercentualComissao;
	private double bonus;
	
	public Empregado3(int tipo) {
		super(tipo);
		this.salario = 0;
		this.PercentualComissao = 0;
		this.bonus = 0;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = 1200 + gerador.nextDouble() * 500;
	}

	public double getValorAReceber() {
		return ValorAReceber;
	}

	public void setValorAReceber(double valorAReceber) {
		ValorAReceber = salario+PercentualComissao*salario+bonus;
	}

	public double getPercentualComissao() {
		return PercentualComissao;
	}

	public void setPercentualComissao(double percentualComissao) {
		PercentualComissao = gerador.nextDouble();
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = 500 + gerador.nextDouble() * 500;
	}
	
	
}
