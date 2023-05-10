package figures.quadrangles;

import figures.FigureCalculations;

public class ConvexQuadrilateral extends Quadrilateral implements FigureCalculations {
    private double diagonalFirst;
    private double diagonalSecond;
    private double angleBetweenDiagonals;
    private boolean diagonalsAreIntersected;

    ConvexQuadrilateral() {
        super.setNameFigures("convex quadrilateral");
        super.setLineCrossedSide(false);
        diagonalsAreIntersected = true;
    }
    // Getter and Setter


    public double getDiagonalFirst() {
        return diagonalFirst;
    }

    public void setDiagonalFirst(double diagonalFirst) {
        this.diagonalFirst = diagonalFirst;
    }

    public double getDiagonalSecond() {
        return diagonalSecond;
    }

    public void setDiagonalSecond(double diagonalSecond) {
        this.diagonalSecond = diagonalSecond;
    }

    public boolean isDiagonalsAreIntersected() {
        return diagonalsAreIntersected;
    }

    public void setDiagonalsAreIntersected(boolean diagonalsAreIntersected) {
        this.diagonalsAreIntersected = diagonalsAreIntersected;
    }

    public double getAngleBetweenDiagonals() {
        return angleBetweenDiagonals;
    }

    public void setAngleBetweenDiagonals(double angleBetweenDiagonals) {
        this.angleBetweenDiagonals = angleBetweenDiagonals;
    }
    // methods

    public void description() {
        super.description();
        System.out.printf("first diagonal: %f, second diagonal: %f, diagonal angle: %f, diagonals are intersected: %s\n",
                diagonalFirst, diagonalFirst, angleBetweenDiagonals, diagonalsAreIntersected ? "YES" : "NO");
    }

    @Override
    public double calculateTheArea() {
        return 0.5 * diagonalFirst * diagonalSecond * Math.sin(angleBetweenDiagonals);
    }

    @Override
    public double calculatePerimeter() {
        return super.getSideOne() + super.getSideTwo() + super.getSideThree() + super.getSideFour();
    }
}
