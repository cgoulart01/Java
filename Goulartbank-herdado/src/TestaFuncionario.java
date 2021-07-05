
public class TestaFuncionario {
 public static void main(String[] args) {
	var pessoa = new Pessoa("Caio Vitor","154.345.432-56");
	var cargo= new Cargo(3);
	System.out.println(cargo.getCargo());
	System.out.println(cargo.setSalario());
	
	var colaborador = new Funcionario(pessoa,cargo);
	System.out.println("Voce ganhou um bônus de Desempenho seu salário com o bônus é R$"+colaborador.getsalarioComBonus());
}
}
