package figures.quadrangles;

public class Rectangle extends Parallelogram  {

    Rectangle(double sideOne, double sideTwo) {
        super.setNameFigures("rectangle");
        super.setSideOne(sideOne);
        super.setSideTwo(sideTwo);
        super.setSideThree(sideOne);
        super.setSideFour(sideTwo);
        super.setCircumscribe(true);
        super.setInscribeCircle(false);
        super.setAngleOne(90);
        super.setAngleTwo(90);
        super.setAngleThree(90);
        super.setAngleFour(90);
    }



    // Getter and Setter




    // methods

    public double calculateTheArea(){
        return super.getSideOne() * super.getSideTwo();
    }
}
