package entities;

public class Carro {

	private String modelo;
	private String placa;
	private double quilometragem;
	private boolean disponibilidade;
	private double diaria;

	public Carro(String modelo, String placa, double quilometragem, boolean disponibilidade, double diaria) {
		this.modelo = modelo;
		this.placa = placa;
		this.quilometragem = quilometragem;
		this.disponibilidade = disponibilidade;
		this.diaria = diaria;
	}

	public boolean alugar() {

		// Verifica se o carro está disponível
		if (disponibilidade == true) {
			disponibilidade = false; // Altera o estado do carro: de disponível para indisponível
			return true; // Retorna true para indicar que a operação deu certo

		} else {
			return false; // Retorna false para indicar falha na operação

		}
	}

	public boolean devolver() {
		if (disponibilidade == false) {
			disponibilidade = true; // altera o estado do objeto
			return true; // informa sucesso da operação
		}
		return false; // informa que não foi possível devolver
	}
	
	public void aumentarKm (double valor) {
	    if (valor > 0) {
	        quilometragem += valor;
	    }
	}

	// getters necessários
	public String getModelo() {
		return modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public double getQuilometragem() {
		return quilometragem;
	}

	public double getDiaria() {
		return diaria;
	}

	public boolean isDisponibilidade() {
		return disponibilidade;
	}
}
