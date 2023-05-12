public class Retangulo extends Shape{
    protected double altura;
    protected double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getArea() {
        return altura*largura;
    }
}
