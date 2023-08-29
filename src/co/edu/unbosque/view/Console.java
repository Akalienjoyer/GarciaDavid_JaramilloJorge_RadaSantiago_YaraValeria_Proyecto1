package co.edu.unbosque.view;

import java.util.Scanner;

public class Console {
	private Scanner lector;

	public Console() {
		lector = new Scanner(System.in);
	}

	public int leerEntero() {
		return lector.nextInt();
	}

	public long leerLong() {
		return lector.nextLong();
	}

	public float leerDecimal() {
		return lector.nextFloat();
	}

	public double leerDecimalDoble() {
		return lector.nextDouble();
	}

	public boolean leerBooleano() {
		return lector.nextBoolean();
	}

	public String leerLineaEntera() {
		return lector.nextLine();
	}

	public String leerPalabra() {
		return lector.next();
	}

	public char leerCharacter() {
		return lector.next().charAt(0);
	}

	public void quemarLinea() {
		lector.nextLine();
	}
}