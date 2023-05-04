package figures;

public class Oval extends Figure{
    private double width;
    private double length;
    private double radiusOne;
    private double radiusTwo;

    Oval(double length, double width, double radiusOne, double radiusTwo){
        super.setNameFigures("oval");
        this.length = length;
        this.width = width;
        this.radiusOne = radiusOne;
        this.radiusTwo = radiusTwo;
    }

    // Setter and Getter


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getRadiusOne() {
        return radiusOne;
    }

    public void setRadiusOne(double radiusOne) {
        this.radiusOne = radiusOne;
    }

    public double getRadiusTwo() {
        return radiusTwo;
    }

    public void setRadiusTwo(double radiusTwo) {
        this.radiusTwo = radiusTwo;
    }
    // methods

    public void description(){
        super.description();
        System.out.printf("length oval: %f, width oval: %f, radius one oval: %f, radius two oval: %f\n", length, width,
                radiusOne, radiusTwo);
    }

    public double calculateAreaOval(){
        return Math.PI * radiusOne * radiusTwo;
    }
    public double calculateLengthOval(){
        return Math.PI * (radiusOne + radiusTwo);
    }

}
