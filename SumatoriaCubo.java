// AUTOR: JUAN DAVID VELASQUEZ BEDOYA - 3012841769

package Presentacion;
import java.util.Scanner;

import Logica.Actualizar;
import Logica.Sumar;

public class SumatoriaCubo {	
	
	public static void main(String[] args) {		
		Actualizar a = new Actualizar();
		Sumar s = new Sumar();
		while(true){
			// PREGUNTA INICIAL Y ELECCION DEL METODO
			String pregunta = new Scanner(System.in).nextLine(); 
			if (pregunta.contains("UPDATE")){				
				a.actualizar(pregunta);
			}
			if(pregunta.contains("QUERY")){
				s.sumar(pregunta);
			}
		}
			
	}

}
