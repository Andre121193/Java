import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primeiroValor = sc.nextInt();
		int segundoValor = sc.nextInt();
		
		int resultadoSomatoria = primeiroValor + segundoValor;
		
		System.out.println("Resultado da somatória é: " + resultadoSomatoria);
		
		sc.close();
	}

}
