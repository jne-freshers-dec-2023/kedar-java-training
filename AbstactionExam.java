
abstract class shape{

    abstract double calculateArea();

    public void displayInfo(){
        System.out.println("This is a shape");
    }
}

class circle extends shape{

    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}


public class AbstactionExam {
    public static void main(String[] args) {

        circle circle = new circle(5.0);

        System.out.println("Area of Circle is :"+circle.calculateArea());
        circle.displayInfo();
    }
}
