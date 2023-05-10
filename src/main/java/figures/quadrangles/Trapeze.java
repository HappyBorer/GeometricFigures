package figures.quadrangles;

public class Trapeze extends ConvexQuadrilateral{
    private double trapezeHeight;
    private double middleLineFirst;
    private double middleLineSecond;
    public Trapeze(){
        super.setNameFigures("trapeze");
    }

    //Getter and Setter


    public double getTrapezeHeight() {
        return trapezeHeight;
    }

    public void setTrapezeHeight(double trapezeHeight) {
        this.trapezeHeight = trapezeHeight;
    }

    public double getMiddleLineFirst() {
        return middleLineFirst;
    }

    public void setMiddleLineFirst(double middleLineFirst) {
        this.middleLineFirst = middleLineFirst;
    }

    public double getMiddleLineSecond() {
        return middleLineSecond;
    }

    public void setMiddleLineSecond(double middleLineSecond) {
        this.middleLineSecond = middleLineSecond;
    }
    // methods

    public double calculateTheArea(){
        return trapezeHeight * (super.getSideOne() + super.getSideTwo())/2;
    }
}
