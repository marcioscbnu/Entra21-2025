package projetum;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// declaracao de variaveis
		String nomePessoa;
		int    idadePessoa;
		float  horasTrabalhadas, valorHora = 25.0f;
		double salarioTotal;
		boolean demitido = false;
		/* entrada de dados
		 * utilizando scanner pela primeira vez
		 */
		Scanner sc = new Scanner(System.in);
		// ln = nova linha = 
		// mostra a expressão e pula para a linha debaixo
		
		// Entrada de Dados
		System.out.println("Informe o seu nome");
		nomePessoa = sc.next();
		
		System.out.println("Acho que o nome que vc informou é : " + nomePessoa);

	}

}
