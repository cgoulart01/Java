
public class Pessoa {
	private String nome;
	private String cpf;
	public Pessoa(String name, String CPF) {
		nome = name;
		cpf = CPF;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
