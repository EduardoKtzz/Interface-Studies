package model.Entities;

public abstract class Animais {

	//Atributos
	private String name;

	public Animais() {

	}

	//Construtor
	public Animais(String name) {
		this.name = name;
	}

	//get e set
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void emitirSom();

	

	





}
