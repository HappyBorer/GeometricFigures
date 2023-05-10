package figures.quadrangles;

public class Rhombus extends Parallelogram{

    Rhombus(double side){
        super.setNameFigures("rhombus");
        super.setCircumscribe(false);
        super.setSideOne(side);
        super.setSideTwo(side);
        super.setSideThree(side);
        super.setSideFour(side);
        super.setCircumscribe(false);
        super.setInscribeCircle(true);
    }

    //methods


}
