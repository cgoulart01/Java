
public class MultiplosDe3 {
	public static void main(String[] args) {
		int numero = 0;
		for (int i = 0; i <= 100; i++) {

			if (numero % 3 == 0) {
				if (numero <= 9 ) {
					System.out.println("0" + numero + " é divisivel por 3");
				}else {
				System.out.println(numero + " é divisivel por 3");
				}
				}
			numero++;
		}
	}
}
