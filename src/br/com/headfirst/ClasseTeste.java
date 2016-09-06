package br.com.headfirst;

public class ClasseTeste {
	public static void main(String args[]){
		ClasseFinal cf = new ClasseFinal();
		
		cf.setNome("Fabio Biasi Mello Rubim");
		System.out.println(cf.getNome()); 
		
		System.out.println("Soma: "+cf.soma(10, 13));
		
		/*ExtendendoFinal ef = new ExtendendoFinal();
		
		ef.setNome("Fabio Biasi Mello Rubim!");
		System.out.println(ef.getNome());*/
	}
}
