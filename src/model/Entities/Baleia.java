package model.Entities;

public class Baleia extends Mamiferos implements AnimalDomesticados {

	//Atributos
	private String tamanho; //String para digitar Tamanho - Grande, medio, pequeno
	private String raça;

	//Construtores
	public Baleia() {

	}

	//get e set 
	public Baleia(String tamanho, String raça) {
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

	@Override
	public void emitirSom() {
		System.out.println("HUHUUHUHU");
	}

	@Override
	public void amamentar() {
		System.out.println();
	}
	
	@Override
	public void alimentar() {
		System.out.println();
	}

	@Override
	public void chamarVeterinario() {
		System.out.println();
	}

	@Override
	public void levarConsultas(){
		System.out.println();
	}




}
