
public class TesteReferencias {
	public static void main(String[] args) {
		Conta conta1 =  new Conta();
		conta1.saldo = 300;
		System.out.println("saldo da primeira conta: " + conta1.saldo);
		conta1.saca(200);
		System.out.println("saldo da primeira conta: " + conta1.saldo);
	}
}
