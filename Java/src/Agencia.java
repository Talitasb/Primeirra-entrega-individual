import java.util.Scanner;

//Talita Sousa Bezerra
public class Agencia {

	private String[] cliente = new String[3];
	private String[] destino = new String[3];
	private String[] email = new String[3];
	private String[] dataida = new String[3];
	private String[] datavolta = new String[3];

	public Agencia() {
	}

	public void cadastrar() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.cliente.length; i++) {
			System.out.println("Digite seu nome");
			this.cliente[i] = sc.nextLine();
			System.out.println("Digite seu email");
			this.email[i] = sc.nextLine();
			System.out.println("Digite o destino");
			this.destino[i] = sc.nextLine();
			System.out.println("Digite a data que deseja ir");
			this.dataida[i] = sc.nextLine();
			System.out.println("Digite a data que deseja retornar");
			this.datavolta[i] = sc.nextLine();
			System.out.println("--------------------------------");
		}
	}

	public void consultar() {
		for (int i = 0; i < this.destino.length; i++) {
			if (this.destino[i] == null) {
				System.out.println("Não existe registro");
				break;
			} else {
				System.out.println();
				System.out.println("Nome:" + this.cliente[i]);
				System.out.println("Destino: " + this.destino[i]);
				System.out.println();
				System.out.println("E-mail: " + this.email[i]);
				System.out.println();
				System.out.println("Data de ida: " + this.dataida[i]);
				System.out.println();
				System.out.println("Data de retorno: " + this.datavolta[i]);
				System.out.println();
				System.out.println("--------------------------------");
			}
		}
	}

	public String[] getCliente() {
		return cliente;
	}

	public void setCliente(String[] cliente) {
		this.cliente = cliente;
	}

	public String[] getDestino() {
		return destino;
	}

	public void setDestino(String[] destino) {
		this.destino = destino;
	}

	public String[] getEmail() {
		return email;
	}

	public void setEmail(String[] email) {
		this.email = email;
	}

	public String[] getDataida() {
		return dataida;
	}

	public void setDataida(String[] dataida) {
		this.dataida = dataida;
	}

	public String[] getDatavolta() {
		return datavolta;
	}

	public void setDatavolta(String[] datavolta) {
		this.datavolta = datavolta;
	}

}
