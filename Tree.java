abstract class Tree {
    protected String description;
    protected float cost;
    protected boolean hasStar;
    public Tree() {
        //System.out.println("Tree constructor.");
        this.description = "Abstract tree";
        this.hasStar = false;
    }
    protected boolean hasStar() {
        return this.hasStar;
    }
    public String getDescription() {
        return this.description;
    }
    protected String getDescriptionHelper() {
        return this.description + " decorated with ";
    }
    public float getCost() {
        return this.cost;
    }
}