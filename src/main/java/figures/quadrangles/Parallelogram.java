package figures.quadrangles;

public class Parallelogram extends ConvexQuadrilateral {
    private boolean sidesArePairwiseParallel;
    private boolean sidesArePairwiseEqual;
    private boolean diagonalDividesIntoTwoEqualTriangles;


    Parallelogram() {
        super.setNameFigures("parallelogram");
        sidesArePairwiseEqual = true;
        sidesArePairwiseParallel = true;
        diagonalDividesIntoTwoEqualTriangles = true;
    }

    // Getter and Setter


    public boolean isSidesArePairwiseParallel() {
        return sidesArePairwiseParallel;
    }

    public void setSidesArePairwiseParallel(boolean sidesArePairwiseParallel) {
        this.sidesArePairwiseParallel = sidesArePairwiseParallel;
    }

    public boolean isSidesArePairwiseEqual() {
        return sidesArePairwiseEqual;
    }

    public void setSidesArePairwiseEqual(boolean sidesArePairwiseEqual) {
        this.sidesArePairwiseEqual = sidesArePairwiseEqual;
    }

    public boolean isDiagonalDividesIntoTwoEqualTriangles() {
        return diagonalDividesIntoTwoEqualTriangles;
    }

    public void setDiagonalDividesIntoTwoEqualTriangles(boolean diagonalDividesIntoTwoEqualTriangles) {
        this.diagonalDividesIntoTwoEqualTriangles = diagonalDividesIntoTwoEqualTriangles;
    }

    // methods

    public void description() {
        super.description();
        System.out.printf("Sides are pairwise parallel: %s, sides are pairwise equal: %s, " +
                        "diagonal divides into two equal triangles: %s", sidesArePairwiseParallel ? "YES" : "NO",
                sidesArePairwiseEqual ? "YES" : "NO", diagonalDividesIntoTwoEqualTriangles ? "YES" : "NO");
    }

    public double calculateTheArea(){
        return 2 * super.getSideOne() * super.getSideTwo();
    }
     public double calculatePerimeter(){
        return 2 * (super.getSideTwo() + super.getSideOne());
     }
}
