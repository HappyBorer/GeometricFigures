package figures.triangles;

import figures.Figure;
import figures.FigureCalculations;

public class Triangle extends Figure implements FigureCalculations {
    private static final double SUMofANGELS = 180;
    private double angleOne;
    private double angleTwo;
    private double angleThree;

    private double sideOne;
    private double sideTwo;
    private double sideThree;

    Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        super.setNameFigures("triangle");
    }

    // Setter and Getter


    public double getAngleOne() {
        return angleOne;
    }

    public void setAngleOne(double angleOne) {
        this.angleOne = angleOne;
    }

    public double getAngleTwo() {
        return angleTwo;
    }

    public void setAngleTwo(double angleTwo) {
        this.angleTwo = angleTwo;
    }

    public double getAngleThree() {
        return angleThree;
    }

    public void setAngleThree(double angleThree) {
        this.angleThree = angleThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    // method

    public void description() {
        super.description();
        System.out.printf("angle one: %f, angle two: %f, angle three: %f, side one: %f, side two: %f, side three: %f",
                angleOne, angleTwo, angleThree, sideOne, sideTwo, sideThree);
    }

    public double calculateTheArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }

    public double calculatePerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
