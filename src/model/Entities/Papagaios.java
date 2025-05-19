package model.Entities;

public class Papagaios extends Ave implements AnimalEstimacao, AnimalDomesticados {

	//Atributos
	private String raça;
	private String cor;
	private String tamanho;  //String para digitar Tamanho - Grande, medio, pequeno

	public Papagaios() {

	}

	public Papagaios(String raça, String cor, String tamanho) {
		this.raça = raça;
		this.cor = cor;
		this.tamanho = tamanho;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void emitirSom() {
		System.out.println("Piar");
	}

	@Override
	public void voar() {
		System.out.println("O papagaio voa de 2 em 2 horas");
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
