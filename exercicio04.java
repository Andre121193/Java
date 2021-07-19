import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigoFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double salarioHora = sc.nextDouble();
		double salarioBruto = horasTrabalhadas * salarioHora;
		System.out.println(codigoFuncionario);
		System.out.printf("Salario: R$ %.2f%n", salarioBruto);

		sc.close();

	}

}
