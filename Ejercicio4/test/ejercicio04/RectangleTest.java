package ejercicio04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ejercicio04.Rectangle;

class RectangleTest {

	// Comprueba el área y perímetro con valores positivos normales
	@Test
	void valoresPositivos() {
		Rectangle r = new Rectangle(3, 4);
		assertAll(() -> assertEquals(12, r.surface()), () -> assertEquals(14, r.perimeter()));
	}

	// Comprueba el comportamiento cuando uno de los valores es negativo
	@Test
	void valoresNegativos() {
		Rectangle r = new Rectangle(-3, 4);
		assertAll(() -> assertEquals(-1, r.surface()), () -> assertEquals(-1, r.perimeter()));
	}

	// Comprueba el comportamiento cuando uno de los valores es cero
	@Test
	void valoresCero() {
		Rectangle r = new Rectangle(0, 4);
		assertAll(() -> assertEquals(0, r.surface()), () -> assertEquals(0, r.perimeter()));
	}

	// Comprueba el comportamiento cuando ambos valores son cero
	@Test
	void ambosCero() {
		Rectangle r = new Rectangle(0, 0);
		assertAll(() -> assertEquals(0, r.surface()), () -> assertEquals(0, r.perimeter()));
	}

	// Comprueba el comportamiento cuando ambos valores son negativos
	@Test
	void ambosNegativos() {
		Rectangle r = new Rectangle(-3, -4);
		assertAll(() -> assertEquals(-1, r.surface()), () -> assertEquals(-1, r.perimeter()));
	}

	// Test intencionalmente incorrecto para verificar detección de errores en
	// pruebas
	@Test
	void testConErroresIntencionales() {
		Rectangle r = new Rectangle(3, 4);

		assertAll(() -> assertEquals(999, r.surface()), () -> assertEquals(0, r.perimeter()));
	}
}