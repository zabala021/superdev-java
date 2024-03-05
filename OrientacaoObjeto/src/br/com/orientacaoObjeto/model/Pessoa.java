package br.com.orientacaoObjeto.model;

public class Pessoa {
	
	int id;
	String nome;
	Integer idade;
	boolean isNegativado;
	
	
	public Pessoa () {
		
	}

	
	public Pessoa (int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	
	public Pessoa (int id) {
		
	}
	
	public int getId( ) {
		return this.id;
	}


	public String getNome() {
		return nome;
	}
	
	public Integer getIdade( ) {
		return this.idade;
	}
	
	public boolean getIsNegativado () {
		return this.isNegativado;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade (Integer idade) {
		this.idade = idade;
	}
	
	public void setIsNegativo (boolean isNegativado) {
		this.isNegativado = isNegativado;
	}
	
	
	
	public void validarSituacao () {
		if (this.isNegativado) {
			System.out.println(this.nome + "está com cadastro negativado");
		} else {
			System.out.println(this.nome + "Cadastro ativo para " + this.nome);
		}
	}
}
