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
    private boolean lineCrossedSide;
    private boolean circumscribe;
    private boolean inscribeCircle;
    Quadrilateral(){
        super.setNameFigures("quadrilateral");
    }
    Quadrilateral(double sideOne, double sideTwo, double sideThree, double sideFour) {

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        this.sideFour = sideFour;

    }


    // Setter and Getter
    public boolean isInscribeCircle() {
        return inscribeCircle;
    }

    public void setInscribeCircle(boolean inscribeCircle) {
        this.inscribeCircle = inscribeCircle;
    }

    public boolean isCircumscribe() {
        return circumscribe;
    }

    public void setCircumscribe(boolean circumscribe) {
        this.circumscribe = circumscribe;
    }
    public double getSUMOfANGLES(){
        return SUMOfANGLES;
    }
    public boolean isLineCrossedSide() {
        return lineCrossedSide;
    }

    public void setLineCrossedSide(boolean lineCrossedSide) {
        this.lineCrossedSide = lineCrossedSide;
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


    public void description() {
        super.description();
        System.out.printf("angel one: %f, angle two: %f, angle three: %f, angle four: %f, side one: %f, side two: %f,\n" +
                        "side three: %f, side four: %f", angleOne, angleTwo, angleThree, angleFour, sideOne, sideTwo, sideThree,
                sideFour);
    }
}
