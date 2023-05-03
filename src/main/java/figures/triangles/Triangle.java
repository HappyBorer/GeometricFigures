package figures.triangles;

import figures.Figure;

public class Triangle extends Figure {
    private static final double SUMofANGELS = 180;
    private double angleOne;
    private double angleTwo;
    private double angleThree;

    private double sideOne;
    private double sideTwo;
    private double sideThree;
    Triangle (double angleOne, double angleTwo, double angleThree){
        if((angleOne + angleTwo + angleThree) > SUMofANGELS){
            this.angleOne = angleOne;
            this.angleTwo = angleTwo;
            this.angleThree = angleThree;
            super.setNameFigures("triangle");
        }else{
            System.out.println("The triangle does not exist.");
        }
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

    public void description(){
        super.description();
        System.out.printf("angle one: %f, angle two: %f, angle three: %f, side one: %f, side two: %f, side three: %f",
                angleOne, angleTwo, angleThree, sideOne, sideTwo, sideThree);
    }
}
