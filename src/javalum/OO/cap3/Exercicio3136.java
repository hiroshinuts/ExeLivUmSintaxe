package javalum.OO.cap3;

/*
 * 
 * Imprima os primeiros numeros da serie de fibonacci até passar de 100, A série de Fibonacci é  a seguinte : 0,1,1,2,3,5,8...etc
 * Para calcula-la, o primeiro elemento vale 0 ,o segundo elemento vale1 ,dai por diante o n-esimo elemento vale o (n-1) énesimo elemento
 * somado ao(n-2)-esimo elemento (Ex: 8 = 5 +3 ).
 * 
 */

public class Exercicio3136 {

	static long fibo(int n) {
		if (n < 2) {
			return n;

		} else {
			return fibo(n - 1) + fibo(n - 2);

		}
	}
	public static void main(String[] args) {
		for (int i = 0; i  < 30; i++) {
			
			System.out.println(Exercicio3136.fibo(i));
		}
	}
}
