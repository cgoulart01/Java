
public class TesteReferencias {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.saldo = 300;
		conta1.deposita(1000);
		System.out.println("saldo da primeira conta: " + conta1.saldo);
		Conta conta2 = new Conta();
		conta2.deposita(600);
		conta1.tranfere(350, conta2);
		System.out.println("saldo da primeira conta: " + conta1.saldo);
		System.out.println("saldo da segunda conta: " + conta2.saldo);
	}
}
