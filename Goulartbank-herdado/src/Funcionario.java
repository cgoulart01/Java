
public class Funcionario {
	private Pessoa pessoa;
	private Cargo cargo;
	public Funcionario(Pessoa valor,Cargo vaga) {
		pessoa = valor;
		cargo = vaga;
	}
	public String getCpf() {
		return this.pessoa.getCpf();
	}
	public String getNome() {
		return this.pessoa.getNome();
	}
	public double getSalario() {
		return this.cargo.getSalario();
	}
	public double getsalarioComBonus(){
		return this.cargo.salarioComBonus();
	}
	public String getCargo() {
		return this.cargo.getCargo();
	}
	
	
}
