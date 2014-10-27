/**
 * 
 */

/**
 * @author Daniel
 *
 */
public class UserPassword {
	
	
	public boolean acceso(String username, String password) throws Exception
	{
		if(!existeUsernamedeDB(username))return false;
		String pass = getPasswordFromUser(username);
		if(pass == password)return true;
		return false;
	}
	
	public boolean existeUsernamedeDB(String user){
		//Suponga que hay una consulta muy demorada a una base de datos.
		//select user from table where...
		try {
		    Thread.sleep(10000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		//Para efectos del workshop solo hay dos usuarios.
		if(user == "alice" || user == "bob"){
			return true;
		}
		return false;
	}
	
	public String getPasswordFromUser(String user) throws Exception
	{
		//Retorna el password de un usuario.
		//Suponga que hay una consulta muy demorada a una base de datos.
		//select user, password from table where...
		try {
		    Thread.sleep(10000);
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		if(user != "alice" && user != "bob"){
			throw new Exception("User not found");
		}
		if(user == "alice")return "passAlice";
		else return "passBob";
	}

}
