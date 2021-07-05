
public class TestaBanco {
	public static void main(String[] args) {
		String nome = "Caio Vitor Goulart";
		String cpf = "111.111.111-44";
		String profissao = "Programador";
		Cliente cliente = new Cliente(nome, cpf, profissao);
		String nome2 = "Maria Joaquia";
		String profissao2 = "Estudante";
		String cpf2 = "155.194.837-94";
		Cliente cliente2 = new Cliente(nome2, cpf2, profissao2);

		Conta contaDocliente = new Conta(cliente);
		Conta contaDocliente2 = new Conta(cliente2);
		Conta contaDocliente3 = new Conta(cliente);

		contaDocliente.deposita(1000);
		contaDocliente2.deposita(1200);
		contaDocliente3.deposita(1500);
		contaDocliente.saca(200);

	}
}
