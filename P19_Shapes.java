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

class Rectangle extends Shape{
    double length;
    double breadth;
    double area(){
        return length*breadth;
    }
    double perimeter(){
        return 2*(length+breadth);
    }
}

class Triangle extends Shape{
    double side1;
    double side2;
    double side3;
    double area(){
        double sp = (side1+side2+side3)/2;
        return Math.sqrt(sp*(sp-side1)*(sp-side2)*(sp-side3));
    }
    double perimeter(){
        return (side1+side2+side3);
    }
}


public class P19_Shapes {
    public static void main(String[] args) {

        Circle Cir = new Circle();
        Cir.radius=3;
        System.out.println("Perimeter of Circle : "+Cir.perimeter());
        System.out.println("Area of Circle : "+Cir.area());

        Rectangle Rec = new Rectangle();
        Rec.length=3;
        Rec.breadth=4;
        System.out.println("Perimeter of Rectangle : "+Rec.perimeter());
        System.out.println("Area of Rectangle : "+Rec.area());

        Triangle Tri = new Triangle();
        Tri.side1=3;
        Tri.side2=4;
        Tri.side3=5;
        System.out.println("Perimeter of Triangle : "+Tri.perimeter());
        System.out.println("Area of Triangle : "+Tri.area());    
    }
}
