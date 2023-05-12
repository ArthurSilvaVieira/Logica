public class Circulo extends Shape {

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double raio;
    public double getArea(){
        return Math.PI*this.raio*this.raio;
    }

}
