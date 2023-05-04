package figures;

public class Circle extends Figure{
    private double radius;
    private double diameter;

    Circle(double radius){
        super.setNameFigures("circle");
        this.radius = radius;
        diameter = radius * 2;
    }

    // Getter and Setter


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter = this.radius * 2;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        radius = this.diameter / 2;
    }

    // methods

    public void description(){
        super.description();
        System.out.printf("radius circle: %f, diameter circle: %f", radius, diameter);
    }

    public double calculateTheArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateTheLength(){
        return 2 * Math.PI * radius;
    }
}
