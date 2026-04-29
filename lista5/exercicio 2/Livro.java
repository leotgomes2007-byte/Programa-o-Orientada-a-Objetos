package projeto;

public class Livro {
	 public String Titulo;
	 public String Autor;
	 public String AnoPublicacao;
	 public String Genero;
	 public boolean Emprestado;
	 
	 public void atribuirValores(String tit,String aut, String anoplu, String gen, boolean empres) {
		 Titulo = tit;
		 Autor = aut;
		 AnoPublicacao = anoplu;
		 Genero = gen;
		 Emprestado = empres;
	 }
	 
	public void exibir(){
		System.out.println("--Dados Livro 1--");
		System.out.println("Titulo:"+Titulo);
		System.out.println("Autor:"+Autor);
		System.out.println("Ano de publicação:"+AnoPublicacao);
		System.out.println("Genero:"+Genero);
		System.out.println("Foi emprestado:"+Emprestado);
	 }
	 
}
