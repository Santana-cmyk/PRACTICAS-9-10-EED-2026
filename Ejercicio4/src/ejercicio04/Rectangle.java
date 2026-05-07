package ejercicio04;

public class Rectangle {

	// Factor usado para calcular el perímetro (2 * lado)
	private static final int FACTOR = 2;

	private int ancho;
	private int alto;

	// Constructor que inicializa el rectángulo con ancho y alto
	public Rectangle(int ancho, int alto) {
		this.ancho = ancho;
		this.alto = alto;
	}

	// Método auxiliar que valida los valores del rectángulo
	// Devuelve:
	// -1 si hay valores negativos
	// 0 si alguno de los valores es cero
	// 1 si los valores son válidos
	private int validateValues() {
		if (ancho < 0 || alto < 0) {
			return -1;
		}
		if (ancho == 0 || alto == 0) {
			return 0;
		}
		return 1;
	}

	// Calcula el área del rectángulo
	// Si los valores no son válidos, devuelve el código de validación
	public int surface() {
		int validation = validateValues();

		if (validation != 1) {
			return validation;
		}

		return ancho * alto;
	}

	// Calcula el perímetro del rectángulo
	// Si los valores no son válidos, devuelve el código de validación
	public int perimeter() {
		int validation = validateValues();

		if (validation != 1) {
			return validation;
		}

		return FACTOR * ancho + FACTOR * alto;
	}
}