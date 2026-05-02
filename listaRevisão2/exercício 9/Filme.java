package projeto;

public class Filme {
	public String titulo;
	public String diretor; 
	public String genero;
	public int duracaoEmMinutos; 

	public Filme(String titulo,String diretor,String genero,int duracaoEmMinutos) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.genero = genero;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
	
	public boolean ehLongo() {
		if(duracaoEmMinutos > 120) {
			return true;
		}else {
			return false;
		}
	}
	
	public void exibirDetalhes(){
		System.out.println("--Informações sobre o filme--");
		System.out.println("Titulo: "+titulo);
		System.out.println("Diretor: "+diretor);
		System.out.println("Duração em Minutos: "+duracaoEmMinutos);
		System.out.println("Genero: "+genero);
	}
}
