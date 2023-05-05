package figures;

public class Hexagon extends Figure implements FigureCalculations{
    private static final double ANGLES = 720;
    private final double ANGLE = 120;
    private double side;

    Hexagon(double side) {
        super.setNameFigures("hexagon");
        this.side = side;

    }

    // Setter and Getter

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    // methods

    public void description() {
        super.description();
        System.out.printf("angel: %f, side: %f",
                ANGLE, side);
    }
    public double sumOfAngles(){
        return ANGLES;
    }

    public double getAngle(){
        return ANGLE;
    }

    public double calculateTheArea(){
        return (3 * Math.sqrt(3) / 2) * Math.pow(side, 2);
    }

    public double calculatePerimeter(){
        return 6 * side;
    }

}
