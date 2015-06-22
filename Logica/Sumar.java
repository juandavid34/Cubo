// AUTOR: JUAN DAVID VELASQUEZ BEDOYA - 3012841769

package Logica;
import Modelo.Cubo;
import Presentacion.SumatoriaCubo;
public class Sumar {
	
	public void sumar(String pregunta){
		
	// En caso de ser QUERY
			try {						
				 // CAPTURA LOS VALORES INICIAL Y FINAL Y RESTA CONSIDERANDO EL CONTEO DE 0 DEL ARRAY
				int vi = Integer.parseInt(pregunta.substring(6, 7)) - 1;
				int vf = Integer.parseInt(pregunta.substring(16)) - 1;
				int sumatoria = 0;
				// SE REALIZA EL RECORRIDO POR LAS CELDAS PARA SUMAR
				for (int i = vi; i <= vf; i++) {
					try {
						sumatoria += Cubo.cubo [i][i][i];
					} catch (Exception e) {	}	
				}
					System.out.println(sumatoria);						
			} catch (Exception e) {	}
	}

}
