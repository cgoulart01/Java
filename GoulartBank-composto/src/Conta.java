import java.util.Random;

public class Conta {
	private double saldo;
	private String agencia;
	private String numero;
	@SuppressWarnings("unused")
	private Cliente titular;
	private int numerosAgencia =1500;
	private int numerosContas = 25;

	public Conta(Cliente titular1) {
		agencia = this.setAgencia();
		numero = this.setNumero();
		titular = titular1;
	}

	public int gerador() {
		Random random = new Random();
		int gerador = random.nextInt();
		return gerador;

	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getAgencia() {
		return this.agencia;

	}
	
	public Cliente getTitular() {
		return this.titular;

	}

	public String getNumero() {
		return this.numero;

	}

	private String setAgencia() {
		Random random = new Random();
		int gen1 =random.nextInt(this.numerosAgencia)+1;
		if(gen1>0) {
			this.setNumerosAgencia();
			return String.valueOf(gen1);
			}else {
			return this.setAgencia();
			}
		}
		
	private void setNumerosAgencia() {
		this.numerosAgencia++;
	}

	private void setNumerosConta() {
		this.numerosContas++;
		
	}

	private String validaNumero(int gen1) {
		if(gen1>0) {
			if(gen1<=9) {
			this.setNumerosConta();
			return "0" + String.valueOf(gen1);
			
			}else
			return String.valueOf(gen1);
			}else {
			return this.setNumero();
			}
		}

	
	private String setNumero() {
	Random random = new Random();
	int gen1 =random.nextInt(this.numerosContas);	
	return validaNumero(gen1);
	}
	
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
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
		}
		return false;
	}
}