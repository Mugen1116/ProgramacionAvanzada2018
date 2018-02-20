package ecuaciones;

import static org.junit.Assert.*;

import org.junit.Test;

//import ecuacion.EcuacionLineal;

public class EcuacionLinealTest {
	@Test
	public void terminoIndependienteCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(); // x + 0 = 0
        ecuacionLineal.setA(1f);
        ecuacionLineal.setB(0f);

		// A partir de aquí, el código que comprueba que la solución es correcta
	}

	@Test
	public void distintosDeCeroTest() {
		EcuacionLineal ecuacionLineal = new EcuacionLineal(); // x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta

		ecuacionLineal = new EcuacionLineal(); // 2x + 1 = 0
		// A partir de aquí, el código que comprueba que la solución es correcta
	}
}
