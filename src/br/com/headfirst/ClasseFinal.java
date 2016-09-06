package br.com.headfirst;

import java.lang.*;

//Toda classe FINAL não pode ser estendida, não terá filhas, como a classe String
public final class ClasseFinal {
	
	public ClasseFinal(){
		this.valor = 1987;//Posso inicializar o atributo FINAL no construtor
	}
	
	private String nome;
	
	//Se a declaração abaixo fosse PUBLIC, eu não conseguiria troca o valor após sua atribuição, por ser FINAL
	private final double valor;// (ou) Posso inicializar o atributo FINAL na declaração do mesmo.
	
	//Não posso ter um setter para o atributo FINAL
	/*public void setValor(double valor){
		this.valor = valor;
	}*/
	
	//Método final não podem ser sobreescritos, pois pode ser um método importante. Se a classe já for FINAL não é necessário
	public final void setNome(String nome){
		this.nome = nome + " Valor: ";
	}
	
	public String getNome(){
		return this.nome;
	}

}
