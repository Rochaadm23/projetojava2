package fundamentos;

public class Temperatura {

	public static void main(String[] args) {

		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		final double FATOR2 = 9.0 / 5.0;
		final double AJUSTEK = 273.15;

		double celciusIn = 26;

		double fahrenheitIn = 78.9;

		double celcius = (fahrenheitIn - AJUSTE) * FATOR;
		System.out.println("O resultado é " + celcius + " °C ");

		double farenheit = celciusIn * FATOR2 + AJUSTE;

		System.out.println("O resultado é " + farenheit + " °F ");

		double kelvin = celciusIn + AJUSTEK;

		System.out.println("O resultado é " + kelvin + " °K");
	}

}
