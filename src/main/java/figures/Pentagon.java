package figures;

public class Pentagon extends Figure implements FigureCalculations{
    private static final double ANGLES = 540;
    private static final double ANGLE = 108;
    private double side;

    Pentagon(double side){
            super.setNameFigures("pentagon");
            this.side = side;
    }

    // Setter and Getter

    public double getAngle(){
        return ANGLE;
    }

    public double getSumOfAngles(){
        return ANGLES;
    }
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


    // methods

    public void description(){
        super.description();
        System.out.printf("angel: %f, side: %f", ANGLE, side);
    }

    public double calculateTheArea(){
        return (Math.pow(side, 2) * Math.sqrt(25 + 10 * Math.sqrt(5))) / 4;
    }

    public double calculatePerimeter(){
        return side * 5;
    }
}
