package br.com.headfirst;

import java.lang.*;

//Toda classe FINAL nao pode ser estendida, nao pode ter filhas, como a classe String
public final class ClasseFinal {
	
	public ClasseFinal(){
		this.valor = 1987;//Posso inicializar o atributo FINAL no construtor
	}
	
	//Variavel membro==variavel de instancia == variavel atributo. Quando um objeto e instanciado ela e conhecida como variavel de instancia
	//Variaveis de atributo possuem valor default. Elas possuem modificadore de acesso.Sao declaradas fora de um metodo.Sao declaradas dentro do bloco de codigo de uma classe.
	private String nome;
	
	//Uma vari�vel de inst�ncia � uma vari�vel cujo valor � espec�fico ao objeto e n�o � classe. 
	//O mais correto seri Variavel DA instancia
	//Uma vari�vel de inst�ncia em geral possui uma valor diferente em cada objeto representante da classe.
	// � uma m� pr�tica usar vari�veis de instancia que n�o sejam privadas.
	
	//Uma vari�vel de classe � uma vari�vel cujo valor � comum a todos os objetos representantes da classe. 
	//Mudar o valor de uma vari�vel de classe em um objeto automaticamente muda o valor para todos os objetos inst�ncias da mesma classe. 
	//Um exemplo �bvio de uma vari�vel de classe seria o n�mero de inst�ncias desta classe que j� foram criadas.
	//Este tipo de vari�vel usamos o modificador STATIC
	
	//Mas � bom notar que neste caso estamos falando de alguns atributos apenas. Se s�o vari�veis de inst�ncia, elas estar�o presentes em cada objeto desta classe.

	//J� vari�veis de classe s�o os atributos que est�o presentes na pr�pria classe e s�o compartilhado por todos objetos dela.

	//Estritamente falando, atributo � um termo mais geral, assim como "membro", � mais geral ainda, j� que inclui os m�todos da classe.
	
	 private String info1; //vari�vel de inst�ncia que � um atributo
	 private static String info2; //vari�vel de classe que � um atributo
	
	//Se a declaracao abaixo fosse PUBLIC, eu nao conseguiria troca o valor da sua atribuicao, por ser FINAL
	private final double valor;// (ou) Posso inicializar o atributo FINAL na declaracao do mesmo ex: private final double valor=20.00 .
	
	//Nao posso ter um setter para o atributo FINAL
	/*public void setValor(double valor){
		this.valor = valor;
	}*/
	
	//Metodo final nao podem ser sobreescritos, pois pode ser um metodo importante. Se a classe ja for FINAL nao e necessario
	public final void setNome(String nome){
		this.nome = nome + " Valor: ";
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int soma(int a, int b){
		int variavel_local_a = a; //Variavel local, definida dentro de um metodo ou bloco de construtor. 
		//Estao disponiveis dentro do metodo/bloco onde foram declaradas.So podem ser utilizadas neste escopo e "morrem" ao acabar o metodo,
		//por esse motivo nao possuem modificados de acesso somente o uso do FINAL.
		
		final int idade = 10; // N�o pode alterar o seu valor apos este ponto
		final int variavel_local_b = b; //Variavel local como FINAL nao pode ter seu valor alterado apos este ponto
		
		//Variaveis locais devem ser inicializadas, elas n�o possuem valor default.
		return variavel_local_a+variavel_local_b+idade; 
		
	}

}
