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
	
	//Uma variável de instância é uma variável cujo valor é específico ao objeto e não à classe. 
	//O mais correto seri Variavel DA instancia
	//Uma variável de instância em geral possui uma valor diferente em cada objeto representante da classe.
	// É uma má prática usar variáveis de instancia que não sejam privadas.
	
	//Uma variável de classe é uma variável cujo valor é comum a todos os objetos representantes da classe. 
	//Mudar o valor de uma variável de classe em um objeto automaticamente muda o valor para todos os objetos instâncias da mesma classe. 
	//Um exemplo óbvio de uma variável de classe seria o número de instâncias desta classe que já foram criadas.
	//Este tipo de variável usamos o modificador STATIC
	
	//Mas é bom notar que neste caso estamos falando de alguns atributos apenas. Se são variáveis de instância, elas estarão presentes em cada objeto desta classe.

	//Já variáveis de classe são os atributos que estão presentes na própria classe e são compartilhado por todos objetos dela.

	//Estritamente falando, atributo é um termo mais geral, assim como "membro", é mais geral ainda, já que inclui os métodos da classe.
	
	 private String info1; //variável de instância que é um atributo
	 private static String info2; //variável de classe que é um atributo
	
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
		
		final int idade = 10; // Não pode alterar o seu valor apos este ponto
		final int variavel_local_b = b; //Variavel local como FINAL nao pode ter seu valor alterado apos este ponto
		
		//Variaveis locais devem ser inicializadas, elas não possuem valor default.
		return variavel_local_a+variavel_local_b+idade; 
		
	}

}
