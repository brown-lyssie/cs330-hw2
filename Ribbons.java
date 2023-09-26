class Ribbons extends TreeDecorator {
    public Ribbons(Tree t) {
        super(t);
        //System.out.println("Ribbons constructor.");
        this.description = "Ribbons Balls";
        this.cost = 2;
    }
}