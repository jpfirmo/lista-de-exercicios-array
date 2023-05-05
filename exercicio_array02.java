import java.util.Scanner;

public class exercicio_array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		double[]notas = new double [4];
		double soma = 0;
		double media;
		
		for(int i = 0; i <= 3; i++ ) {
			System.out.println("digite um número: ");
			notas[i] = entrada.nextDouble();
			soma += notas[i];
			System.out.println("nota [" + i + "]:" + notas[i]);
			
		}
		media = soma / 4;
		System.out.println("media é: " + media);
	}

}
