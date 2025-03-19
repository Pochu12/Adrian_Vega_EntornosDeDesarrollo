public class main {
    public static void main(String[] args) {
       
        AV_Rectangulo cuadrado = new AV_Rectangulo(5.0, 5.0, "Rojo");

        AV_Circulo circulo = new AV_Circulo(7.0, "Azul");

        double areaCuadrado = cuadrado.getLadoA() * cuadrado.getLadoB();
        double areaCirculo = Math.PI * Math.pow(circulo.getRadio(), 2);
        double diferenciaAreas = areaCuadrado - areaCirculo;

        System.out.println("Área del Cuadrado: " + areaCuadrado);
        System.out.println("Área del Círculo: " + areaCirculo);
        System.out.println("Diferencia de Áreas: " + diferenciaAreas);

  }
}