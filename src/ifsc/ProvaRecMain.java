package ifsc;

import java.util.Scanner;

public class ProvaRecMain {
	public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			int[] numeros = new int[10];
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = Integer.valueOf(ler.nextLine());
				if (numeros[i] <= 0) {
					System.out.println(" numero invalido digite outro!!\n");
					i--;

				}
			}

			for (int i = 0; i < numeros.length; i++) {
				System.out.printf("numeros: %d\n", numeros[i]);
			}

			System.out.printf("Soma do vetor: %.2f", calcula_Soma(numeros));

		}

		public static double calcula_Soma(int[] numeros) {
			int soma = 0;
			for (int i = 0; i < numeros.length; i++) {
				soma += numeros[i];

			}
			return soma ;

		}

	

}
