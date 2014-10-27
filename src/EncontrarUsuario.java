import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */

/**
 * @author Daniel
 *
 */
public class EncontrarUsuario implements LeerArchivo{
	
	Set<String> hash = new HashSet<String>();
	
	@Override
	public void leerArchivo() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
		try {
	        String line;

	        while ((line = br.readLine()) != null) {
	            hash.add(line);
	        }
	    } finally {
	        br.close();
	    }
		
	}

	@Override
	public boolean encontrarUsuario(String usuario) {
		if(hash.contains(usuario))return true;
		return false;
	}

}
