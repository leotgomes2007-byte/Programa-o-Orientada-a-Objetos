package project;

public class ain {

	public static void main(String[] args) {
		//exemplo 1
		int[] numeros = {1,2,3};
		System.out.println("numeros[3]");//ArrayindexOutOfboundException
		
		
		//exemplo 2
		int a= 10;
		int b = 0;
		System.out.println("a/b");//arithmeticException
		
		//exemplo 3
		String numero = "abc";
		int valor = Integer.parseInt(numero);//numberFormaException
		
		
		
	}

}
