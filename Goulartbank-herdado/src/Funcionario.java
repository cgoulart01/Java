
public class Funcionario {
	private Pessoa pessoa;
	private String cargo;
	private double salario;
	public Funcionario(Pessoa valor,String vaga, double vencimento) {
		pessoa = valor;
		cargo = vaga;
		salario = vencimento;
	}
	public String getCpf() {
		return this.pessoa.getCpf();
	}
	public String getNome() {
		return this.pessoa.getNome();
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	private double getBonus() {
		return this.salario*0.1;
	}
}
