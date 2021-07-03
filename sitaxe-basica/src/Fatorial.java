
public class Fatorial {
	public static void main(String[] args) {
		
		for (int contador=0;contador<=10;contador++) { 
			 int fat = fatorial(contador);
			System.out.println(" o resultado de "+contador+"! é "+fat);
		}
		
		}
	public static int fatorial (int numero) {
		int fatorial = 1;
		for(int i = 1;i<=numero;i++) {
			fatorial *=i;
		}
		return fatorial;
	}
}
