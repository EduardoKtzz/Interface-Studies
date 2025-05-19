package model.Entities;

public class Gato extends Mamiferos implements AnimalEstimacao, AnimalDomesticados {

	//Atributos
	private String raça;
	private String tamanho;  //String para digitar Tamanho - Grande, medio, pequeno

	//Construtores
	public Gato(){

	}

	public Gato(String raça, String tamanho) {
		this.raça = raça;
		this.tamanho = tamanho;
	}

	//Get e set
	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	//Métados da classe abstradas
	public void emitirSom() {
		System.out.println("Miau miau!");
	}

	public void amamentar() {
		System.out.println("O gato gosta de ser amamentado de 2 em 2 horas!");
	}

		@Override
	public void brincar() {
		System.out.println("");
	}

	@Override
	public void carinho() {
		System.out.println("");
	}

	@Override
	public void passear() {
		System.out.println("");
	}

	@Override
	public void alimentar() {
		System.out.println();
	}

	@Override
	public void levarConsultas() {
		System.out.println();
	}

	@Override
	public void chamarVeterinario() {
		System.out.println();
	}
	
}
