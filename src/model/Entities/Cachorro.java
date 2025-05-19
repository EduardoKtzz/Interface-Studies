package model.Entities;

public class Cachorro extends Mamiferos implements AnimalEstimacao, AnimalDomesticados {

	//Atributos
	private String tamanho;  //String para digitar Tamanho - Grande, medio, pequeno
	private String raça;

	public Cachorro() {

	}

	public Cachorro(String tamanho, String raça) {
		this.tamanho = tamanho;
		this.raça = raça;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public void emitirSom() {
		System.out.println("Au Au");
	}

	public void amamentar() {
		System.out.println("O cachorro gosta de ser amamentado de 3 em 3 horas!");
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
