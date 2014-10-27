import java.util.List;


public class MetodosSort {
	
	//Puede no estar correcto
	public List<Integer> bubbleSort(List<Integer> arreglo) throws Exception {
		// Se debe retornar un arreglo nuevo y el antiguo debe permanecer
		// intacto, deben estar de menor a mayor.
		//Si la lista esta vacia, se genera una excepcion.
		if(arreglo.size() == 0)
			throw new Exception("La lista esta vacia");
		for(int i = 0; i < arreglo.size() - 1; i ++)
		{
			for(int j = 0; j < arreglo.size() - 1; j ++)
			{
				if(arreglo.get(j) < arreglo.get(j+1))
				{
					int aux = arreglo.get(j);
					arreglo.set(j, arreglo.get(j+1));
					arreglo.set(j+1, aux);
				}
			}
		}
		return arreglo;

	}
}
