import java.util.Scanner;

public class exercicio_array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int[]numeros = new int[4];
		
		for(int i = 0; i <= 3; i++) {
			System.out.println("digite um número: ");
			numeros[i] = entrada.nextInt();
			
		}
		for(int i = 0; i <= 3; i++) {
			System.out.println("posição[" + i + "]:" + numeros[i]);
		}

	}

}
