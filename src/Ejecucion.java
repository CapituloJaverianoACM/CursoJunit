import java.awt.List;
import java.util.ArrayList;
import java.util.Random;


public class Ejecucion {

	public static void main(String[] args) throws Exception {
		
		
		MetodosSimples ms = new MetodosSimples();
		
		int num = ms.multiplicacion(3, 8);
		System.out.println("3*8 = "+num);
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i = 0; i < 10; i++){
			arr.add(rand.nextInt(100));
		}
		MetodosSort msort = new MetodosSort();
		ArrayList<Integer> arr2 = (ArrayList<Integer>) msort.bubbleSort(arr);
		
		System.out.println("arreglo Ordenado");
		for(int i = 0; i < 10; i++){
			System.out.print(arr2.get(i)+" ");
		}
		System.out.println();
		
		
		EncontrarUsuario e = new EncontrarUsuario();
		e.leerArchivo();
		System.out.println(e.encontrarUsuario("alice"));
		
		
		UserPassword up = new UserPassword();
		
		if(up.acceso("alice", "passAlice")){
			System.out.println("alice pudo acceder");
		}else{
			System.out.println("alice no pudo acceder");
		}
		
		
	}

}
