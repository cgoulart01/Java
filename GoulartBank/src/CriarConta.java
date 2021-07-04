
public class CriarConta {
	public static void main(String[] args) {
		Conta primeira = new Conta();
		primeira.saldo = 200;
		System.out.println(primeira.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo+=300;
		System.out.println(segundaConta.saldo);
		segundaConta.saldo = 1000;
		System.out.println(segundaConta.saldo);
	}
}
