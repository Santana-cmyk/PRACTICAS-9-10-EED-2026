package ejercicio01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void valoresPositivos() {
		Rectangle r = new Rectangle(3, 4);
		assertAll(() -> assertEquals(12, r.area()), () -> assertEquals(14, r.perimetro()));
	}

	@Test
	void valoresNegativos() {
		Rectangle r = new Rectangle(-3, 4);
		assertAll(() -> assertEquals(-1, r.area()), () -> assertEquals(-1, r.perimetro()));
	}

	@Test
	void valoresCero() {
		Rectangle r = new Rectangle(0, 4);
		assertAll(() -> assertEquals(0, r.area()), () -> assertEquals(0, r.perimetro()));
	}

	@Test
	void ambosCero() {
		Rectangle r = new Rectangle(0, 0);
		assertAll(() -> assertEquals(0, r.area()), () -> assertEquals(0, r.perimetro()));
	}

	@Test
	void ambosNegativos() {
		Rectangle r = new Rectangle(-3, -4);
		assertAll(() -> assertEquals(-1, r.area()), () -> assertEquals(-1, r.perimetro()));
	}

	@Test
	void testConErroresIntencionales() {
		Rectangle r = new Rectangle(3, 4);

		assertAll(() -> assertEquals(999, r.area()), () -> assertEquals(0, r.perimetro()));
	}
}