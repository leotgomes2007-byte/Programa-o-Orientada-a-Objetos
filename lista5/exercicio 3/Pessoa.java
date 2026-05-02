package projeto;

public class Pessoa {
	 public String nome;
	 public String email;
	 public String dataNascimento;
	 public String Endereco;
	 public boolean Admin;
	 
	 public void atribuirValores(String no,String em, String dataNasc, String end, boolean adm) {
		 nome = no;
		 email = em;
		 dataNascimento = dataNasc;
		 Endereco = end;
		 Admin = adm;
	 }
	 public void exibirEmail() {
		 System.out.println("O seu email é "+email+" se sim(true) se não(false):");
	 }
	 
	public void  promoverAdmin( boolean adm) {
		 adm = true;
	}
	 
	public void exibir(){
		System.out.println("--Dados Livro 1--");
		System.out.println("Nome:"+nome);
		System.out.println("Email:"+email);
		System.out.println("Data de nascimento:"+dataNascimento);
		System.out.println("Endereço:"+Endereco);
		System.out.println("É admistrador:"+Admin);
	 }
	 

}
