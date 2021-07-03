
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicinais\n");
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado;
		if(quantidadePessoas >= 2) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		if (idade>=18 ||/** ou*/ acompanhado) {
			System.out.println("Seja Bem vindo");
		}else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}

