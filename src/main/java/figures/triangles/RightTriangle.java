package figures.triangles;

public class RightTriangle extends Triangle{
    RightTriangle(double sideOne, double sideTwo, double sideThree){
        super(sideOne, sideTwo, sideThree);
        super.setNameFigures("right triangle");
        super.setAngleOne(90);

    }
}
