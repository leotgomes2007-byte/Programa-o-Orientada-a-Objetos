package poeject;

public class Smartphone implements PC, Celular {
	String tel;
	String email;
	
	
	public Smartphone(String tel, String email) {
		super();
		this.tel = tel;
		this.email = email;
	}

	@Override
	public void RealizarChamada() {
		System.out.println("verificando Emails");
	}

	@Override
	public void verificaEmail() {
		System.out.println("Relizando chamadas");
	}

}
