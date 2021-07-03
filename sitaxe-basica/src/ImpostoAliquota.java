
public class ImpostoAliquota {
	/**
	 * dados validos a partir do mês de abril do ano-calendário de 2015.
	 * */
	public static void main(String[] args) {
		double salario = 1900.00;
		if (salario > 4664.68) {

			String porcentagem = "27,5%";
			System.out.println("a dedução do IR do seu salário é de " + porcentagem);
			System.out.println("você pode deduzir até R$869,36.");
		}
		if (salario <= 4664.68 && salario >= 3751.06) {
			String porcentagem = "22,5%";
			System.out.println("a dedução do IR do seu salário é de " + porcentagem);
			System.out.println("você pode deduzir até R$636,13.");
		}
		if (salario < 3751.06 && salario >= 2826.66) {

			String porcentagem = "15%";
			System.out.println("a dedução do IR do seu salário é de " + porcentagem);
			System.out.println("você pode deduzir até R$354,80.");
		}
		if (salario < 2826.66 && salario >= 1903.99) {
			String porcentagem = "7,5%";
			System.out.println("a dedução do IR do seu salário é de " + porcentagem);
			System.out.println("você pode deduzir até R$142,80.");
		}
		if (salario < 1903.99) {
			System.out.println("seu salário é R$" + salario + "e você é insento de dedução do IR.");
		}
	}
}
