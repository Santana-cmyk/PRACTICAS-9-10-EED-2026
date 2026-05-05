package ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void valoresPositivos() {
		Rectangulo r = new Rectangulo(3, 4);
		assertAll(() -> assertEquals(12, r.area()), () -> assertEquals(14, r.perimetro()));
	}

	@Test
	void valoresNegativos() {
		Rectangulo r = new Rectangulo(-3, 4);
		assertAll(() -> assertEquals(-1, r.area()), () -> assertEquals(-1, r.perimetro()));
	}

	@Test
	void valoresCero() {
		Rectangulo r = new Rectangulo(0, 4);
		assertAll(() -> assertEquals(0, r.area()), () -> assertEquals(0, r.perimetro()));
	}

	@Test
	void ambosCero() {
		Rectangulo r = new Rectangulo(0, 0);
		assertAll(() -> assertEquals(0, r.area()), () -> assertEquals(0, r.perimetro()));
	}

	@Test
	void ambosNegativos() {
		Rectangulo r = new Rectangulo(-3, -4);
		assertAll(() -> assertEquals(-1, r.area()), () -> assertEquals(-1, r.perimetro()));
	}

	@Test
	void testConErroresIntencionales() {
		Rectangulo r = new Rectangulo(3, 4);

		assertAll(() -> assertEquals(999, r.area()), () -> assertEquals(0, r.perimetro()));
	}
}