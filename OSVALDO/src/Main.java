public class Main {
    public static void main(String[] args)
    {
        Circulo disco=new Circulo(12.7);
        Retangulo paralelepipedo = new Retangulo(5,4);
        Quadrado raiz = new Quadrado(2);
        disco.imprimirArea();
        paralelepipedo.imprimirArea();
        raiz.imprimirArea();
        disco.metodoConcreto1();
        disco.metodoConcreto2();
        paralelepipedo.metodoConcreto1();
        paralelepipedo.metodoConcreto2();
        raiz.metodoConcreto1();
        disco.metodoConcreto2();
    }
}