// AUTOR: JUAN DAVID VELASQUEZ BEDOYA - 3012841769

package Logica;

import Modelo.Cubo;
public class Actualizar {
	
	public void actualizar(String pregunta){
	try {	// DEBIDO A QUE LA ENTRADA PUEDE NO SER LA CORRECTA
		int c = Integer.parseInt(pregunta.substring(7,8));
		int v = Integer.parseInt(pregunta.substring(13));
		
		// SI LAS CELDAS SON MAYORES QUE EL ARRAY SE DUPLICA SE DUPLICA POR Y AGRANDA
		if (Cubo.cubo.length < c){ 
			int [][][] cuboTemporal = new int [c][c][c];
			for (int i = 0; i < Cubo.cubo.length; i++) {
				cuboTemporal[i][i][i] = Cubo.cubo [i][i][i];
			}
			Cubo.cubo = cuboTemporal;
		}
		c = c-1; // ACTUALIZA c DEBIDO A QUE LOS ARRAYS CUENTAN DESDE 0 Y NO DESDE 1
		Cubo.cubo [c][c][c] = v; //INGRESA EL VALOR DESEADO EN LAS CELDAS DESEADAS		
	} catch (Exception e) {
	}
	}
}
