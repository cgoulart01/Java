
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "111.111.111-44";
		paulo.profissao = "Empresário";
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(1000);

		contaDoPaulo.titular = paulo;
	}
}
