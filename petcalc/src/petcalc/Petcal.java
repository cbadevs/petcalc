package petcalc;

import java.util.Scanner;

public class Petcal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int nivel, valorX = 0;
		String operador;

		System.out.print("Ingrese el Nivel[0 - 3]:");
		nivel = teclado.nextInt();

		System.out.print("Ingrese el Operación[Suma, Rest, Divi, Mult]:");
		operador = teclado.next();

		System.out.print("La operaciones:");
		Operaciones juego;
		juego = new Operaciones();
		juego.Iniciar(nivel);
		juego.Suma();
		switch (operador) {
		case "Suma":
			juego.Suma();
			break;
		case "Rest":
			juego.Rest();
			break;
		case "Divi":
			juego.Milt();
			break;
		case "Mult":
			juego.Divi();
			break;
		}

		System.out.println(juego.Mostrar());

		System.out.print("Ingrese el valor:");
		valorX = teclado.nextInt();

		if (valorX == juego.setOculto()) {
			System.out.print("Felicitaciones");
		} else {
			System.out.print("Eso ha estado serca vuele a intentarlo");
		}

	}

}
