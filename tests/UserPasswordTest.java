import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;


public class UserPasswordTest {
	UserPassword usp;
	@Before
	public void setUp() throws Exception {
		usp = Mockito.spy(new UserPassword());
		Mockito.doReturn(true).when(usp).existeUsernamedeDB("derp");
		Mockito.doReturn("DerpPass").when(usp).getPasswordFromUser("derp");
	}

	@Test
	public void verificiacion() throws Exception {
		assertTrue(usp.acceso("derp", "DerpPass"));
		assertFalse(usp.acceso("derp", "malPassword"));
	}
	
	//Puede no ser muy buena idea probar el throw, dado que no se esta probando la
	//busqueda en la base de datos, sino el otro funcionamiento aparte de eso.
}
