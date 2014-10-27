import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Daniel
 *
 */
public class MetodosSortTest {

	List<Integer> lista;
	MetodosSort sort;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		sort = new MetodosSort();
		lista = new ArrayList<Integer>();
		lista.add(4);
		lista.add(5);
		lista.add(0);
		lista.add(4);
		lista.add(-5);
		lista.add(1);
	}

	@Test
	public void correctitud() throws Exception {
		int tam = lista.size();
		List<Integer> resultado = sort.bubbleSort(lista);
		assertEquals("Tamano diferente", resultado.size(), tam);
		for(int i = 0; i < tam - 1; i ++)
		{
			assertFalse("No es correcto", resultado.get(i) > resultado.get(i + 1));	
		}
	}
	
	@Test
	public void ListaConstante() throws Exception {
		List<Integer> anterior = new ArrayList<Integer>(lista);
		List<Integer> resultado = sort.bubbleSort(lista);
		assertFalse("Esta devolviendo la misma lista", lista == resultado);
		for(int i = 0; i < lista.size(); i ++){
			assertTrue("Cambia algun valor del parametro", anterior.get(i) == lista.get(i));
		}
	}
	
	@Test(expected = Exception.class)
	public void ListaVacia() throws Exception {
		List<Integer> vacia = new ArrayList<Integer>();
		List<Integer> resultado = sort.bubbleSort(vacia);
		
	}
	
	
}
