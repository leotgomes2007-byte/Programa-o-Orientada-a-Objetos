package projeto;

public class Filme {
public String titulo;
public int duracao; //(em minutos)
public int classificacaoEtaria;


 public Filme(String ti,int du,int clas) {
	 titulo = ti;
	 duracao = du;
	 classificacaoEtaria = clas;
 }


public double converterDuracaoHoras(){
	return duracao/60;
}

public boolean podeAssistir(int idade) {
	if(idade > classificacaoEtaria ) {
		return true;
	}else {
			return false;
		}
	}

public void descricaoFilme() {
	System.out.println("--Descrição do filme--");
	System.out.println("O filme se chama "+titulo+" e tem duração de "+duracao+" e calssificação "+classificacaoEtaria);
}

}
