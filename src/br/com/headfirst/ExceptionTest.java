package br.com.headfirst;

public class ExceptionTest {
	public static void main(String[] args) throws Exception{
		System.out.println("Início do main");
		metodo1();
		System.out.println("Fim do main");
	}
	
	static void metodo1(){
		System.out.println("Inicio do metodo 1");
		metodo2();
		System.out.println("Fim do metodo 1");
	}
	
	static void metodo2(){
		System.out.println("Inicio do metodo 2");
		int[] array = new int[10];
		for(int i=0;i<=15;i++){
			array[i]=i;
			System.out.println(i);
		}
		System.out.println("Fim do metodo 2");
	}
	
	
	//Try-catch é uma chance de se recuperar do erro. Uma chance de tratar a exceção
	//Se você quer dar a chance de quem chama o código de tratar o erro use Checked Exception, obrigando o chamado usar try-catch
	//caso não saiba como se recuperar do erro, ele será obrigado a relançar e exceção, assim outro local terá a chance de recuperar o erro
	//Use checked exceptions para erros recuperáveis.
	
	//Unchecked
	//Para erros irrecuperáveis não queremos dar a chance de recuperar um erro. Se deu erro, não há o que fazer a não ser informar o usuário.
	//Como unchecked exception não é obrigatório o handle-or-declare o mais comum é que a exceção vá subundo na pilha de chamadas e seja exibida ao usuário
	//Pode-se criar um componente especialista em "pegar" exceções não tratadas, com isso ao chegar a exceção ele poderia interceptar
	//e gerar um logo por exemplo, rollback e etc.
	//Componente Inteceptador em JAva Web: Servlet Filters ou tratamento de erro declarativo pertecente à especificação ser servlet/jsp(seção error-page do web.xml)
	
	//Nunca exiba o stacktrace em um tratamento de uma exception
	
	//Sempre relance erros que você não está preparado para tratar. Nunca pegue um erro e ignore-o. 
	//O rollback de uma transação pode depender da ocorrência de um erro irrecuperável que você acaba de esconder do resto do sistema!
	

}
