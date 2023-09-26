class LEDs extends TreeDecorator {
    public LEDs(Tree t) {
        super(t);
        //System.out.println("LEDs constructor.");
        this.description = "LEDs";
        this.cost = 10;
    }
}