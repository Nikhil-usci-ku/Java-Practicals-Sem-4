import java.lang.Math;
import java.util.Scanner;

class Shape{
    double area(){return 0;}
    double perimeter(){return 0;}
}

class Circle extends Shape{
    double radius;
    double area(){
        return Math.PI*Math.pow(this.radius,2);
    }
}




public class Shapes {
    public static void main(String[] args) {

        Circle Cir = new Circle();
        Cir.radius=3;
        double areaa = Math.PI*Math.pow(3,2);
        System.out.println(Cir.area());
        System.out.println(areaa);
    }
}
