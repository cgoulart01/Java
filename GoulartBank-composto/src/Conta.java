import java.util.Random;

public class Conta {

	private double saldo;
	private String agencia;
	private String numero;
	private Cliente titular;
	private static int numerosAgencia = 1500;
	private static int numerosContas = 25;

	public Conta(Cliente nome) {
		System.out.println(nome.getNome() + " sua conta está sendo criada...");
		agencia = this.setAgencia();
		numero = this.setNumero();
		titular = nome;
		System.out.println("Nome do Titular: " + nome.getNome());
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Número da Conta: " + this.getNumero());
		System.out.println("Saldo: R$" + String.valueOf(getSaldo()));
		System.out.println("sua conta foi Criada com Sucesso.");
		System.out.println();
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
		int gen1 = random.nextInt(Conta.numerosAgencia);
		if (gen1 > 0) {
			this.setNumerosAgencia();
			return String.valueOf(gen1);
		} else {
			return this.setAgencia();
		}
	}

	private void setNumerosAgencia() {
		Conta.numerosAgencia++;
	}

	private void setNumerosConta() {
		Conta.numerosContas++;

	}

	private String validaNumero(int gen1) {
		if (gen1 > 0) {
			if (gen1 <= 9) {
				this.setNumerosConta();
				return "0" + String.valueOf(gen1);

			} else
				return String.valueOf(gen1);
		} else {
			return this.setNumero();
		}
	}

	private String setNumero() {
		Random random = new Random();
		int gen1 = random.nextInt(Conta.numerosContas);
		Conta.numerosContas++;
		return validaNumero(gen1);
	}

	public void deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			this.transacao(valor,"Depósito");
			System.out.println();
		} else {
			System.out.println("Valor inválido.");
		}
	}

	private void transacao(double valor,String exec) {
		/**
		 * descobir como gerar um número aleatório diferente para
		 * toda transação efetuada
		 */
		Random gerador = new Random(999999999999999999l);
		System.out.println("Código da transação: " + gerador.nextLong());
		System.out.println(exec+" no valor de R$" + valor);
		System.out.println("Nome do Titular: " + this.titular.getNome());
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Número da Conta: " + this.getNumero());
		System.out.println("Saldo atual: R$" + String.valueOf(getSaldo()));
	}

	public boolean saca(double valor) {
		if (valor > this.saldo) {
			System.out.println("Valor inválido");
			return false;
		}
		this.saldo -= valor;
		this.transacao(valor, "Saque");
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