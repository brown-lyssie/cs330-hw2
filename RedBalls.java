class RedBalls extends TreeDecorator {
    public RedBalls(Tree t) {
        super(t);
        //System.out.println("Red Balls constructor.");
        this.description = "Red Balls";
        this.cost = 1;
    }
}