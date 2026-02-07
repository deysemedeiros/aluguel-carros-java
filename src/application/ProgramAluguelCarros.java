package application;

import java.util.Scanner;

import entities.Carro;

public class ProgramAluguelCarros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite as informações do veículo: ");
		String modelo = sc.next();
		String placa = sc.next();
		double km= sc.nextDouble();
		double valorDiaria = sc.nextDouble();

		// O carro nasce disponível
		Carro c = new Carro(modelo, placa, km, true, valorDiaria);

		// variavel para controlar se o veiculo esta alugado ou não 
		boolean alugou = false;

		// 1. Verifica a disponibilidade
		if (c.isDisponibilidade()) {

			System.out.println("Veículo disponível para locação.");

			System.out.print("Deseja alugar? Digite 1 para sim | 2 para não: ");
			int resp = sc.nextInt();

			if (resp == 1) {
				alugou = c.alugar();

				if (alugou) {
					System.out.println("Veículo alugado com sucesso!");
				}
			} else {
				System.out.println("Você optou por não alugar o veículo.");
			}

		} else {
			System.out.println("Veículo indisponível para locação.");
		}

		// 6. Devolução — só se alugou
		if (alugou) {

			System.out.println("Digite a quantidade de dias alocados: ");
			int dias = sc.nextInt();

			System.out.println("Digite a quantidade de km usados pelo usuário: ");
			double kmRodados = sc.nextDouble();

			c.aumentarKm(kmRodados);

			double valor = (dias * valorDiaria) + (kmRodados * 0.15);

			c.devolver();

			System.out.println("O valor total do aluguel foi: " + valor);
		}

	}
}
