
public class Ejecucion {

	public static void main(String[] args) throws Exception {
		EncontrarUsuario e = new EncontrarUsuario();
		e.leerArchivo();
		System.out.println(e.encontrarUsuario("alice"));

	}

}
