package figures.quadrangles;

public class Square extends Rectangle{

    public Square(double sideOne) {
        super(sideOne, sideOne);
        super.setNameFigures("square");
        super.setInscribeCircle(true);
    }
    //Getter and Setter



    //methods
    public double calculateTheArea(){
        return Math.pow(super.getSideOne(), 2);
    }

    public double calculatePerimeter(){
        return super.getSideOne() * 4;
    }
}
