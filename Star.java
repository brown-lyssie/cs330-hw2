class Star extends TreeDecorator {
    public Star(Tree t) {
        super(t);
        //System.out.println("Star constructor.");
        this.description = "Star";
        this.cost = 4;
        this.hasStar = true;
        if (!this.isFirstStar()) {
            this.displayNotFirstStar();
        }
    }
    protected boolean hasStar() {
        return this.hasStar;
    }
    private void displayNotFirstStar() {
        System.out.println("Tree already has a star!");
    }
    public float getCost() {
        if (this.isFirstStar()) {
            return this.tree.getCost() + this.cost;
        }
        else {
        //System.out.println("in the else");
            return this.tree.getCost();
        }

    }
    protected boolean isFirstStar() {
        return (this.hasStar() && !(this.tree.hasStar()));
    }
    public String getDescription() {
        String desc;
        //System.out.println("in getdeschelper");
        if (this.isFirstStar()) {
            desc = this.tree.getDescriptionHelper() + this.description;
        }
        else {
            desc = this.tree.getDescription();
        }
        return desc;
    }
    protected String getDescriptionHelper() {
        //System.out.println("in getdeschelper");
        if (this.isFirstStar()) {
            return this.tree.getDescriptionHelper() + this.description + ", ";
        }
        else {
            return this.tree.getDescriptionHelper();
        }
    }
}