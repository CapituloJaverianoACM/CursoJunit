public class LogIn {

	LeerArchivo encontrar;

	// Este constructor es el encargado de la inyeccion de dependencias.
	public LogIn(LeerArchivo encontrar) {
		this.encontrar = encontrar;
	}

	public LogIn() {
		this.encontrar = new EncontrarUsuario();
	}

	public boolean ExisteUsuarioDeMail(String mail) throws Exception {
		encontrar.leerArchivo();
		String usuario = mail.substring(0, mail.indexOf("@"));
		System.out.println(usuario);
		return encontrar.encontrarUsuario(usuario);

	}

}
