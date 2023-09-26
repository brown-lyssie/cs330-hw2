class Ruffles extends TreeDecorator {
    public Ruffles(Tree t) {
        super(t);
        //System.out.println("Ruffles constructor.");
        this.description = "Ruffles";
        this.cost = 1;
    }
}