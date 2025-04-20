package Examen;

public class Main {

	public static void main(String[] args) {
		AV_Circulo circulo1 = new AV_Circulo(1,8, "Verde");
		AV_Rectangulo rectangulo1 = new AV_Rectangulo(1, 3, 5, "Azul");
		
		
		//Calculamos el area del circulo multiplicando PI con radio al cuadrado gracias a Math.pow se puede elevar al cuadrado:
		 double AreaCirculo = Math.PI * Math.pow(circulo1.getRadio(), 2);
		 
		//Calculamos el area del rectangulo multiplicando el ladoA con el ladoB:
	     double AreaRectangulo = rectangulo1.getLadoA() * rectangulo1.getLadoB();
		
        //Para calcular la diferencia restamos:
	     double Diferencia = (AreaCirculo - AreaRectangulo);
      
		System.out.println(circulo1);
		System.out.println(rectangulo1);
		System.out.println("El área del circulo es:" + AreaCirculo);
		System.out.println("El área del rectangulo es:" + AreaRectangulo);
		System.out.println("La diferencia es de:" + Diferencia);
	}
}
