public class AV_Circulo {
    private int id;
private double radio;

public AV_Circulo(int id, double radio, String color) {
    this.id = id;
    this.radio = radio;
    this.color = color;
}

public String toString() {
    return "AV_Circulo{" + "color=" + color + '}';
}
private String color; 

public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public double getRadio() {
    return radio;
}

public void setRadio(double radio) {
    this.radio = radio;
}

public String getColor() {
    return color;
}

public void setColor(String color) {
    this.color = color;
}
}
