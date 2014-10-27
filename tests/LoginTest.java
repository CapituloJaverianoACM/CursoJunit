import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Daniel
 * 
 */
public class LoginTest {
	
	public class MockEncontrarUsuario implements LeerArchivo{
		public String[] listaUsuarios;
		public boolean lei = false;
		public MockEncontrarUsuario(){
			listaUsuarios = new String[4];
			listaUsuarios[0] = "alice";
			listaUsuarios[1] = "basura";
			listaUsuarios[2] = "derp";
			listaUsuarios[3] = "basura2";
		}
		@Override
		public void leerArchivo() throws Exception {
			lei = true;
		}
		@Override
		public boolean encontrarUsuario(String usuario) {
			for(int i = 0; i < listaUsuarios.length; i ++)
			{
				if(usuario.equals(listaUsuarios[i]))
					return true;
			}
			return false;
		}
	}
	
	LogIn login;
	String[] listaUsuarios;
	MockEncontrarUsuario mock;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		/*
		 * Esta es la forma sin inyeccion de dependencias, no es una buena
		 * practica. 
		   login = new LogIn();
		 */
		//Aca esta la inyeccion de dependencias.
		mock = new MockEncontrarUsuario();
		login = new LogIn(mock);
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
		assertTrue(mock.lei);
	}
	

}
