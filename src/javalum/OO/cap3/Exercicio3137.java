package javalum.OO.cap3;

/*
 * 
 * Escreva um programa que ,dada uma variavel x com algum valor inteiro, temos um novo x de acordo com a seguinte regra:
 *  -se x é par, x = x / 2
 *  -se x é impar x = 3 * x + 1
 *  -imprime x
 *  O programa deve parar quando x tiver o valor final de 1 . Por exemplo,para x= 13,a saída será:
 *  
 *  
 *  40 - 20 - 10 - 5 -16 -8 - 4 - 2 - 1
 * 
 */

public class Exercicio3137 {

	public static void main(String[] args) {

		int x = 13; // Considerando que o valor de X seja 13
		int y = 0;

		while (x != 1) {
			if (x % 2 == 0) {
				y = x / 2;
			} else {
				y = 3 * x + 1;
			}
			System.out.println(y);
			x = y;
		}
	}
}
