import java.lang.Math;

class Shape{
    double area(){return 0;}
    double perimeter(){return 0;}
}

class Circle extends Shape{
    double radius;
    double area(){
        return Math.PI*Math.pow(this.radius,2);
    }
    double perimeter(){
        return 2*Math.PI*radius;
    }
}




public class Shapes {
    public static void main(String[] args) {

        Circle Cir = new Circle();
        Cir.radius=3;
        System.out.println("Perimeter of Circle : "+Cir.perimeter());
        System.out.println("Area of Circle : "+Cir.area());
    }
}
