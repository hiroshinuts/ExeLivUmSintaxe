package javalum.OO.cap3;

import java.math.BigInteger;

//imprima o fatoraialde a 1 a 40

public class Exercicio3134 {
	
		public static void main(String[] args) {
			
			BigInteger fatorial = BigInteger.ONE;
			for (long n = 1 ; n <= 40; n++) {
				fatorial = fatorial.multiply(BigInteger.valueOf(n));
				System.out.println("O fatorial de "+ n + "! é igual a " + fatorial);
			}
			
		}
}
