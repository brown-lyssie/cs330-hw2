class SilverBalls extends TreeDecorator {
    public SilverBalls(Tree t) {
        super(t);
        //System.out.println("Silver Balls constructor.");
        this.description = "Silver Balls";
        this.cost = 3;
    }
}