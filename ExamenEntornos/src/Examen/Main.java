package Examen;

public class Main {

	public static void main(String[] args) {
		AV_Circulo circulo1 = new AV_Circulo(1,8, "Verde");
		AV_Rectangulo rectangulo1 = new AV_Rectangulo(1, 3, 5, "Azul");
		
		//Almacenamos las variables:
		ImprimirResultados(circulo1, rectangulo1);
		
	}
	
	//definimos el método para poder imprimir, a los que llamamos circulo y rectangulo quienes reciben la info que nos den arriba:
	private static void ImprimirResultados(AV_Circulo circulo, AV_Rectangulo rectangulo) {	
		//Calculamos el area del circulo multiplicando PI con radio al cuadrado gracias a Math.pow se puede elevar al cuadrado:
		 double AreaCirculo = CalcularAreaCirculo(circulo);
		 
		//Calculamos el area del rectangulo multiplicando el ladoA con el ladoB:
	     double AreaRectangulo = CalcularAreaRectangulo(rectangulo);
		
        //Para calcular la diferencia restamos:
	     double Diferencia = CalcularDiferencia(AreaCirculo, AreaRectangulo);
      
		System.out.println(circulo);
		System.out.println(rectangulo);
		System.out.println("El área del circulo es:" + AreaCirculo);
		System.out.println("El área del rectangulo es:" + AreaRectangulo);
		System.out.println("La diferencia es de:" + Diferencia);
	}

	private static double CalcularDiferencia(double AreaCirculo, double AreaRectangulo) {
		double Diferencia = (AreaCirculo - AreaRectangulo);
		return Diferencia;
	}

	private static double CalcularAreaRectangulo(AV_Rectangulo rectangulo1) {
		double AreaRectangulo = rectangulo1.getLadoA() * rectangulo1.getLadoB();
		return AreaRectangulo;
	}

	private static double CalcularAreaCirculo(AV_Circulo circulo1) {
		double AreaCirculo = Math.PI * Math.pow(circulo1.getRadio(), 2);
		return AreaCirculo;
	}
}
