package Examen;

/**
 * Autor: Adrián Vega
 * Versión: 1.0
 * 
 * Esta clase nos permite calcular el área del circulo e ir a atributos por los metodos getter y setter.
 */
public class AV_Circulo {
	private int id;
	private double radio;
	private String color;
	
	//Constructor por defecto
	public AV_Circulo() {}
	
	//Constructor con todos los parametros:
	public AV_Circulo(int id, double radio, String color) {
		super();
		this.id = id;
		this.radio = radio;
		this.color = color;
	}

	//Obtenemos el id del circulo:
	public int getId() {
		return id;
	}

	//establece el id del circulo
	public void setId(int id) {
		this.id = id;
	}

	//obtenemos el radio
	public double getRadio() {
		return radio;
	}

	//establecemos un radio:
	public void setRadio(double radio) {
		this.radio = radio;
	}
	//obtenemos el color

	public String getColor() {
		return color;
	}
	//establecemos un color:

	public void setColor(String color) {
		this.color = color;
	}
	//Nos devuelve en cadena todo lo que tenemos del circulo:
	@Override
	public String toString() {
		return "AV_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
	}

	//calcula el area del circulo:
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    
	
	
	
	
	
	
}
