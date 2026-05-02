package projeto;

public class Aluno {
	public String nome;
	public String matricula;
	public int anoIngresso;
	public String dataNascimento;
	
	public Aluno(String nomeAluno,String matriculaAluno) {
		nome = nomeAluno;
		matricula = matriculaAluno;
		
		System.out.println("Nome:"+nome);
		System.out.println("Matricula"+matricula);
	}
	
	public Aluno(String dataNascimentoAluno) {
		dataNascimento = dataNascimentoAluno;
		System.out.println("Data de Nascimento:"+dataNascimento);
	}
	
	public Aluno(String nomeAluno,String dataNascimentoAluno, int anoIngressoAluno) {
		nome = nomeAluno;
		dataNascimento = dataNascimentoAluno;
		anoIngresso = anoIngressoAluno;
		
		System.out.println("Nome:"+nome);
		System.out.println("Data de Nascimento:"+dataNascimento);
		System.out.println("Ano de Ingresso:"+anoIngresso);

	}
}
