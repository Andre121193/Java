import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codPeca1 = sc.nextInt();
		int qtdPeca1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		double valorTotal1 = qtdPeca1 * valorUnitario1;
		int codPeca2 = sc.nextInt();
		int qtdPeca2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		double valorTotal2 = qtdPeca2 * valorUnitario2;
		double valorTotalPagar = valorTotal1 + valorTotal2;
		System.out.printf("peça código: %d, quantidade de peças: %d, valor das peças: %.2f %n", codPeca1, qtdPeca1,
				valorTotal1);
		System.out.printf("peça código: %d, quantidade de peças: %d, valor das peças: %.2f %n", codPeca2, qtdPeca2,
				valorTotal2);
		System.out.printf("Valor total das mercadorias: R$ %.2f %n", valorTotalPagar);
		sc.close();

	}

}
