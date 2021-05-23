package paquete2;

public class Triangulo {
	private int base;
	private int altura;
	
	/**
	 * Crea un triangulo a través de la base y altura
	 * @param altura Indica la altura del triangulo
	 * @param base Indica la base del triangulo
	 */

	public Triangulo(int altura, int base) {
		this.altura = altura;
		this.base = base;
	}

	/**
	 * Método para obtener el valor de la base del triangulo
	 * @return El valor de la base del triangulo
	 */
	public int getBase() {
		return base;
	}
	
	/**
	 * Método para obtener el valor de la altura del triangulo
	 * @return El valor de la base del altura
	 */
	public int getAltura() {
		return altura;
	}
	
	/**
	 * Método para cambiar el valor de la base del triangulo
	 * @param base Valor para cambiar la base del triangulo
	 */
	public void setBase(int base) {
		this.base=base;
	}
	
	/**
	 * Método para cambiar el valor de la altura del triangulo
	 * @param altura Valor para cambiar la altura del triangulo
	 */
	public void setAltura(int altura) {
		this.altura=altura;
	}
	
	/**
	 * Metodo que devuelve una cadena con los valores de la base y altura del triangulo
	 * @return cadena ( con el valor de la base y altura del triangulo)
	 */
	public String toString() {
		return "Triangulo [base="+base+", altura="+altura+"]";
	}
	
	/**
	 * Calcula el area del triangulo con respecto al valor de la base y la altura del mismo
	 * 
	 * @return el total del calculo del area del triangulo
	 */
	public double areaTriangulo() {
		double area=this.base*this.altura/2.0;
		
		return area;
	}
	
}
