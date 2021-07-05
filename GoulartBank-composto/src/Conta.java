public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	
		
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
		if (this.saldo>=valor){
		this.saldo-= valor;
		destino.deposita(valor);
	}
		return false;
	}
}