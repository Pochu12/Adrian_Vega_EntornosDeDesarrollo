package Examen;

/**Autor: Adrián Vega
	Versión: 1.0
	
	Esta clase nos representa un rectangulo donde obtenemos los lados, id y su color 
	y nos permite calcular su área:
*/
public class AV_Rectangulo {
	private int id;
	private double ladoA;
	private double ladoB;
	private String color;
	
	//Constructor por defecto
	public AV_Rectangulo( ) {}

	//Constructor con todos los parametros:
	public AV_Rectangulo(int id, double ladoA, double ladoB, String color) {
		super();
		this.id = id;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.color = color;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//Recapitulamos todos los atributos que hemos recogido:
	@Override
	public String toString() {
		return "AV_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
	}
	
	//Calculamos el area del rectangulo:
    public double calcularArea() {
        return ladoA * ladoB;
    }
	
	
	
	
}
