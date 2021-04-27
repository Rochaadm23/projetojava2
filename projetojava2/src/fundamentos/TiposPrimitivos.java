package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//Tipos númericos INTEIROS
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234__845_223L;
		
		//Tipos númericos REAIS
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo BOOLEANO
		boolean estaDeFerias = false;//true
		
		
		//Tipo CARACTERE
		
		char status = 'A';
		
		// Dias de empresa do funcionários
		
		System.out.println("Anos de empresa " + anosDeEmpresa * 365);
		System.out.println("Numero de viagens " + numeroDeVoos /2);
		System.out.println("Pontos acumulados " + pontosAcumulados / vendasAcumuladas);
		System.out.println("O " + id + " ganha " + salario);
		System.out.println("Está de férias ? " + estaDeFerias);
		System.out.println("Status " + status);
		
		
		
	}

}
