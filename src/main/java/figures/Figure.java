package figures;

public abstract class Figure {
    private String nameFigures;
    private boolean flatFigure;

    {
        nameFigures = "No name";
        flatFigure = true;
    }

    // setter and getter


    public String getNameFigures() {
        return nameFigures;
    }

    public void setNameFigures(String nameFigures) {
        this.nameFigures = nameFigures;
    }

    public boolean isFlatFigure() {
        return flatFigure;
    }

    public void setFlatFigure(boolean flatFigure) {
        this.flatFigure = flatFigure;
    }

    // method

    public void description() {
        System.out.printf("Name figures: %s, is the figure flat?: %s\n", nameFigures, flatFigure ? "YES" : "NO");
    }

}
