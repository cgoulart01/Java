
public class TestaBanco {
	public static void main(String[] args) {
		String nome = "Paulo Silveira";
		String cpf = "111.111.111-44";
		String profissao = "Empresário";
		Cliente paulo = new Cliente(nome,cpf,profissao);
			
		Conta contaDoPaulo = new Conta(paulo);
		contaDoPaulo.deposita(1000);
		
		Conta contaDoPaulo2 = new Conta(paulo);
		contaDoPaulo2.deposita(1200);
		Conta contaDoPaulo3 = new Conta(paulo);
		contaDoPaulo3.deposita(1500);
		System.out.println("Conta 1 do "+ contaDoPaulo.getTitular().getNome());
		System.out.println(contaDoPaulo.getAgencia());
		System.out.println(contaDoPaulo.getNumero());
		System.out.println(contaDoPaulo.getSaldo());
		System.out.println("Conta 2 do "+ contaDoPaulo2.getTitular().getNome());
		System.out.println(contaDoPaulo2.getAgencia());
		System.out.println(contaDoPaulo2.getNumero());
		System.out.println(contaDoPaulo2.getSaldo());
		System.out.println("Conta 3 do " + contaDoPaulo3.getTitular().getNome());
		System.out.println(contaDoPaulo3.getAgencia());
		System.out.println(contaDoPaulo3.getNumero());
		System.out.println(contaDoPaulo3.getSaldo());
	}
}
