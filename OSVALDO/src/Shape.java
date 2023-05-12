public abstract class Shape {
    public abstract double getArea();
    public static void metodoConcreto1(){
        System.out.println("Eu sou Conncreto mesmo sendo abstrata");
   }
    public static boolean metodoConcreto2(){
      return true|false;
    }
    public void imprimirArea(){
        System.out.println("A Area é: "+ getArea());
    }
}
