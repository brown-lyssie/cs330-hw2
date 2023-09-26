abstract class TreeDecorator extends Tree {
    protected Tree tree;
    public TreeDecorator(Tree t) {
        super();
        this.tree = t;
    }
    protected boolean hasStar() {
        return this.tree.hasStar();
    }
    public float getCost() {
        return this.cost + this.tree.getCost();
    }
    public String getDescription() {
        String desc = this.tree.getDescriptionHelper() + this.description;
        desc += " costs $" + Float.toString(this.getCost());
        return desc;
    }
    protected String getDescriptionHelper() {
        return this.tree.getDescriptionHelper() + this.description + ", ";
    }
}