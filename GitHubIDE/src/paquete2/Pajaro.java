public class Pajaro {
	private String nombre;
	private int posX,posY;
	
	public Pajaro() {
		
	}
	
	public Pajaro(String nombre,int posX,int posY) {
		this.nombre=nombre;
		this.posX=posX;
		this.posY=posY;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setPosX(int posX) {
		this.posX=posX;
	}
	
	public void setPosY(int posY) {
		this.posY=posY;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}
	
	public String toString() {
		return "\nNOMBRE: "+nombre+
				"\nPOSICION X: "+posX+
				"\nPOSICION Y: "+posY;
	}
	
	/**
	 * volar(int posX, int posY).
	 * Devuelve un valor de tipo double, usando la palabra clave return.
	 * El valor devuelto es el resultado de aplicar un desplazamiento de acuerdo
	 * con la siguiente fórmula.
	 * @return devuelve distancia desde 0, o hasta posX,posY double
	 */
	public double volar(int posX, int posY) {
		/*double distancia=0.0;
		distancia=Math.sqrt(Math.pow(posX, 2)+Math.pow(posY, 2));
		return distancia;*/
		return Math.sqrt(Math.pow(posX, 2)+Math.pow(posY, 2));
	}
	
	public static void main(String[] a) {
		//crea el objeto llamando a constructor por defecto
		Pajaro pajaro;
		pajaro=new Pajaro();
		System.out.println(pajaro.toString());
		
		Pajaro pajaro1=new Pajaro("PIOLIN",2,3);
		System.out.println(pajaro1.toString());
		String nombre;
		int x,y;
		System.out.println("NOMBRE?? ");
		nombre=Entrada.cadena();
		
		System.out.println("POSICION x");
		x=Entrada.entero();
		
		System.out.println("POSICION y");
		y=Entrada.entero();
		
		Pajaro pajaro2=new Pajaro(nombre,x,y);
		System.out.println(pajaro2.toString());
		
		//cambiamos los valores de los atributos (pruebas de set)
		pajaro.setNombre("ELQUESEA");
		pajaro.setPosX(25);
		pajaro.setPosY(30);
		System.out.println("LOS VALORES ACTUALES DE LOS ATRIBUTOS DE PAJARO SON");
		System.out.println(pajaro.toString());
		
		//PRUEBA GET, ESCRIBE VALORES DE LOS ATRIBUTOS
		System.out.println("EL PÁJARO SE LLAMA "+pajaro.getNombre()+
				" ESTÁ EN LA POSICIÓN ("+pajaro.getPosX()+","+pajaro.getPosY()+")");
	}
}
