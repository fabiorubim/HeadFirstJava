package br.com.headfirst;

public class ExtendendoFinal extends ClasseFinal{
  @Override
  public String getNome(){
	  return "Nome: "+super.getNome();
  }
  
  @Override
  public void setNome(String nome){
	  super.setNome(nome);
  }
}
