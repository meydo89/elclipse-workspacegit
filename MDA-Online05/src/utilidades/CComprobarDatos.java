/**
 * 
 */
package utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Abraham Mellado Domene
 *
 */
public class CComprobarDatos {

	public static boolean comprobarNif(String nif) {
        Pattern patronnif = Pattern.compile("^([0-9]{8})[A-Za-z]$");//establecemos el patron del metodo
        Matcher matcher = patronnif.matcher(nif);//pasamos el contenido de la variable
        boolean matchFound = matcher.find();//establecemos una variable booleana por la cual sera valida al encontrar el patron en la variable
       
        if (matchFound) {//en caso de ser correcta mandamos un mensaje de nif correcto
            System.out.println("Nif correcto");
        } else {//en caso de no ser correcto mandamos el siguiente mensaje
            System.out.println("Nif incorrecto");
        }
		return matchFound;//retornamos el contenido de martchFound(valido)

    }

    public static boolean comprobarRefCatastral(String refCatastral) {
    	
        Pattern patronrefCatrastral = Pattern.compile("^([0-9]{7})\\s([A-Z]{2}[0-9]{4}[A-Z])\\s([0-9]{4})\\s([A-Z]{2})$");//establecemos el patron del al referecia catastral
        Matcher matcher = patronrefCatrastral.matcher(refCatastral);//pasaremos el contenido de la varible haciendo match si sigue el patron
        boolean matchFound = matcher.find(); //pasamos la variable en caso de ser correcto a matchFound
       
        if (matchFound) {//si se sigue el patron se manda el siguiente mensaje
            System.out.println("Referencia catastral correcta");

        } else {//si no mandamos este otro
            System.out.println("Referencia catastral incorrecta");
        }
		return matchFound;//retornamos el patron con la variable mathFound
    }

    public static boolean comprobarCodigoProducto(String codigoProducto) {
        Pattern patroncodigoProducto = Pattern.compile("^([A-Z]{2})([0-9]{6})$");//establecemos el patron correcto 
        Matcher matcher = patroncodigoProducto.matcher(codigoProducto);//pasamos la varible haciendo match al ser correcta
        boolean matchFound = matcher.find();//le pasamos el contenido de la variable a mathcFound
        if (matchFound) {//si se ejecuta mathcFound mandamos el siguiente mensaje
            System.out.println("Codigo de producto correcto");
        } else {//en caso contrario este otro
            System.out.println("Codigo de producto incorrecto");
        }//retornamos el contenido de matchFound
		return matchFound;
    }
}
