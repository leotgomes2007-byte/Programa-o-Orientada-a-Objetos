package project;

public class Produto {
	 public String nome;
	 public int quantidade;
	 public float preco;

	public Produto (String no, int quant, float pre){
			nome = no;
			preco = pre;
			quantidade = quant;
	}
	
	public float ValorTotalEstoque(){
		return preco*quantidade;
	}
	
	public boolean temEstoque() {
			if(quantidade > 0) {
				return true;
			}else{
				return false;
			}
	}
	
	public int adicionarEstoque(int novos) {
		
		return quantidade+= novos;
	}
	
	public int vender(int vendas) {
		
		return quantidade-= vendas;
	}
}
