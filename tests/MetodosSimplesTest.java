import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class MetodosSimplesTest {
	
	MetodosSimples claseProbar;

	@Before
	public void setUp() throws Exception {
		 claseProbar = new MetodosSimples();
	}

	@Test
	public void testMultiplicacion() {
		int a = 4;
		int b = 5;
		int respuesta_real = a * b;
		int respuesta_probable = claseProbar.multiplicacion(a, b);
		assertEquals(respuesta_real, respuesta_probable);
	}

}
