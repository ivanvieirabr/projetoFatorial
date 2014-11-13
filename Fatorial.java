public class Fatorial {
	/* Versao iterativa do calculo do fatorial */
	public int calcularFatorial(int n) {
		if (n < 0)
		   throw new IllegalArgumentException("N�o existe faltorial para n�meros negativos");

		int resultado = 1;

		if(n != 0) {
		   for(int i = 2; i <= n; i++) 
			resultado *= i;
		}
		return resultado;
	}
}