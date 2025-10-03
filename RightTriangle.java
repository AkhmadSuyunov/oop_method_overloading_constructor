package mohirdev.oop_methodOverloading_constructor;

public class RightTriangle {
     private int a;
     private int b;
     private double c;

public RightTriangle(int a, int b){
    this.a = a;
    this.b = b;
    this.c = Math.sqrt(a*a + b*b);
}
    public double getA() {
        return a;
    };
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }

    //with double parameters
    public double area() {
        return 0.5 * a * b;
    }
    //with int parameters
    public double area(int a, int b){
        return 0.5 * a * b;
    }
    //with float parameters
    public double area(float a, float b){
        return 0.5 * a * b;
    }
    //with long parameters
    public double area(long a, long b) {
        return 0.5 * a * b;
    }

    //with double parameters
    public double perimeter() {
        return a + b + c;
    }
    //with int parameters
    public double perimeter(int a, int b) {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }
    //with float parameters
    public double perimeter(float a, float b) {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }
    //with long parameters
    public double perimeter(long a, long b) {
        double c = Math.sqrt(a * a + b * b);
        return a + b + c;
    }

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle(3, 4);

        System.out.println("Area (double): " + rightTriangle.area());
        System.out.println("Perimeter (double): " + rightTriangle.perimeter());

        System.out.println("Area (int): " + rightTriangle.area(3, 4));
        System.out.println("Perimeter (int): " + rightTriangle.perimeter(3, 4));

        System.out.println("Area (float): " + rightTriangle.area(3.0f, 4.0f));
        System.out.println("Perimeter (float): " + rightTriangle.perimeter(3.0f, 4.0f));

        System.out.println("Area (long): " + rightTriangle.area(3L, 4L));
        System.out.println("Perimeter (long): " + rightTriangle.perimeter(3L, 4L));
    }
}
