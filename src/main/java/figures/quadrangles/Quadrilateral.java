package figures.quadrangles;

import figures.Figure;

public class Quadrilateral extends Figure {
    private static final double SUMOfANGLES = 360;
    private double angleOne;
    private double angleTwo;
    private double angleThree;
    private double angleFour;
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double sideFour;

    Quadrilateral(double angleOne, double angleTwo, double angleThree, double angleFour){
        if(checkingForExistence(angleOne, angleTwo, angleThree, angleFour)){
            this.angleOne = angleOne;
            this.angleTwo = angleTwo;
            this.angleThree = angleThree;
            this.angleFour = angleFour;
            super.setNameFigures("quadrilateral");
        }else{
            System.out.println("The rectangle cannot exist");
        }
    }



    // Setter and Getter


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

    public double getSideFour() {
        return sideFour;
    }

    public void setSideFour(double sideFour) {
        this.sideFour = sideFour;
    }

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

    public double getAngleFour() {
        return angleFour;
    }

    public void setAngleFour(double angleFour) {
        this.angleFour = angleFour;
    }

    // methods

    private boolean checkingForExistence(double angleOne, double angleTwo, double angleThree, double angleFour){
        if((angleOne + angleTwo + angleThree + angleFour) != SUMOfANGLES){
            return false;
        }
        if(angleOne > (angleTwo + angleThree + angleFour) || angleTwo > (angleOne + angleThree + angleFour)
                || angleThree > (angleOne + angleTwo + angleFour) || angleFour > (angleOne + angleTwo + angleThree)){
            return false;
        }
        return true;
    }
    public void description(){
        super.description();
        System.out.printf("angel one: %f, angle two: %f, angle three: %f, angle four: %f, side one: %f, side two: %f,\n" +
                "side three: %f, side four: %f", angleOne, angleTwo, angleThree, angleFour, sideOne, sideTwo, sideThree,
                sideFour);
    }
}
