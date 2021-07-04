
public class Fatorial {
	public static void main(String[] args) {
		
		for (var contador=0;contador<=10;contador++) { 
			 var fat = fatorial(contador);
			 if(contador<=9)
				 System.out.println(" o resultado de  "+contador+"! é "+fat);
			 else
			 System.out.println(" o resultado de "+contador+"! é "+fat);
		}
		
		}
	public static int fatorial (int numero) {
		var fatorial = 1;
		for(var i = 1;i<=numero;i++) {
			fatorial *=i;
		}
		return fatorial;
	}
}
