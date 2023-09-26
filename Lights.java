class Lights extends TreeDecorator {
    public Lights(Tree t) {
        super(t);
        //System.out.println("Lights constructor.");
        this.description = "Lights";
        this.cost = 5;
    }
}