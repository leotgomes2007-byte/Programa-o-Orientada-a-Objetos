package projeto;

public class disciplina {
	public String nome;
	public String cargaHoraria;
	public String nomeProfessor;
	
	public void atribuirValores(String nom,String carg,String nomprof) {
		nome = nom;
		cargaHoraria = carg;
		nomeProfessor = nomprof;
	}
	
	
	public String retornaNome(){
		return nome;
	}
	
	public String retornaCargaHoraria(){
		return cargaHoraria;
	}
	
	public String retornaNomeProfessor(){
		return nomeProfessor;
	}

	public void exibir() {
		System.out.println("Nome da disciplina:"+nome);
		System.out.println("carga horaria da disciplina:"+cargaHoraria);
		System.out.println("Nome do professor da disciplina:"+nomeProfessor);
	}
}
