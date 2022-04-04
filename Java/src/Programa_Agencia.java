import java.util.Scanner;

//Talita Sousa Bezerra
public class Programa_Agencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agencia agencia = new Agencia();

		int opcao;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("================================");
			System.out.println("|      Agencia de Viagens      |");
			System.out.println("================================");
			System.out.println("|             MENU             |");
			System.out.println("--------------------------------");
			System.out.println("| 1 | Cadastrar");
			System.out.println("| 2 | Consultar");
			System.out.println("| 0 | Encerrar");
			opcao = entrada.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Tenha uma boa viagem!");
				break;
			case 1:
				agencia.cadastrar();
				break;
			case 2:
				agencia.consultar();
				break;
			default:
				System.out.println("Número invalido");
				break;
			}
		} while (opcao != 0);

	}

}
