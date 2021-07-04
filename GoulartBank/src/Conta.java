public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (valor > this.saldo) {
			return false;
		}
		this.saldo -= valor;
		return true;
	}

	public boolean tranfere(double valor, Conta destino) {
		if(valor>this.saldo) {
			return false;
		}if(this.saldo==0) {
		return false;	
	} else {
		return true;
	}
}