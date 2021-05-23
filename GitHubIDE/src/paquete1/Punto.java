package paquete1;

public class Punto {
	//declaracion de atributos
		private double x, y;
		
		/**
		 * Crea un punto a través de las coordenadas x e y en el eje de coordenadas
		 * @param x Indica la coordenada x en el eje de coordenadas
		 * @param y Indica la coodenada y en el eje de coordenadas
		 */

	//constructor parametrizado
		public Punto(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		// Métodos set
		/**
		 * Método para cambiar el valor de la coordenada x
		 * @param x Valor para cambiar la coordenada x
		 */
		public void setX(double x) {
			this.x = x;
		}
		
		/**
		 * Método para cambiar el valor de la coordenada y
		 * @param y Valor para cambiar la coordenada y
		 */
		public void setY(double y) {
			this.y = y;
		}

		
		// Métodos get
		/**
		 * Método para obtener el valor de la coordenada x
		 * @return El valor de x
		 */
		public double getX() {
			return x;
		}

		/**
		 * Método para obtener el valor de la coordenada y
		 * @return El valor de y
		 */
		public double getY() {
			return y;
		}

		// Método toString
		/**
		 * Metodo que devuelve una cadena con los valores de las coordenadas
		 * @return Coordenadas (x,y)
		 */
		public String toString() {
			return "(x,y)= (" + x + "," + y + ")";
		}

		// Métodos definidos por el usuario
		/**
		 * Calcula la situacion del punto con respecto a los ejes
		 * 
		 * @return cadena ( con los valores cuadrante1.... cuadrante4 ejex, ejey,origen)
		 */
		public String cuadrante() {
			String devuelve;
			if (x > 0)
				if (y > 0)
					devuelve = "CUADRANTE I";
				else if (y == 0)
					devuelve = "EJE X";
				else
					devuelve = "CUADRANTE IV";
			else 
				if (x < 0)
					if (y > 0)
						devuelve = "CUADRANTE II";
					else
						if(y==0)
							devuelve="EJE X";
							else
								devuelve = "CUADRANTE III";
				else
					if(y!=0)
						devuelve="EJE Y";
					else
						devuelve="ORIGEN DE COORDENADAS";

			return devuelve;
		}

		/**
		 * Calcula distancia del punto referencia con el origen
		 * 
		 * @return double que es la distancia
		 */
		public double distancia() {

			return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		}
}
