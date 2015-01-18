public class Fatorial {
	/* Versao iterativa do calculo do fatorial, incluindo o teste para n=0 xxxx*/
	public int calcularFatorial(int n) {
		if (n < 0)
		   throw new IllegalArgumentException("Não existe faltorial para números negativos");

		int resultado = 1;

		if(n != 0) {
		   for(int i = 2; i <= n; i++) 
			resultado *= i;
		}
		System.out.println("Teste NOVO...");

		return resultado;
	}
}