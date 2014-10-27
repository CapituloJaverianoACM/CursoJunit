import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;



public class LoginTestMockito {

	LogIn login;
	String[] listaUsuarios;
	EncontrarUsuario mockEncontrar;
	@Before
	public void setUp() throws Exception {

		mockEncontrar = Mockito.mock(EncontrarUsuario.class);
		Mockito.when(mockEncontrar.encontrarUsuario("alice")).thenReturn(true);
		Mockito.when(mockEncontrar.encontrarUsuario("derp")).thenReturn(true);
		login = new LogIn(mockEncontrar);
		listaUsuarios = new String[4];
		listaUsuarios[0] = "alice@mail.com";
		listaUsuarios[1] = "bob.com@alice";
		listaUsuarios[2] = "derp@foo.com";
		listaUsuarios[3] = "dserrano@asdf.net.ne.n";
	}
	

	
	@Test
	public void test() throws Exception {
		assertTrue(login.ExisteUsuarioDeMail(listaUsuarios[0]));
		assertFalse(login.ExisteUsuarioDeMail(listaUsuarios[1]));
		assertTrue(login.ExisteUsuarioDeMail(listaUsuarios[2]));
		assertFalse(login.ExisteUsuarioDeMail(listaUsuarios[3]));
		Mockito.verify(mockEncontrar, Mockito.atLeast(1)).leerArchivo();
		//Mockito.verify(mockEncontrar, Mockito.atLeastOnce());
		
	}

}
