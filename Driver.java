class Driver {
    public static void main(String[] args) {
        //System.out.println("This is my package!");
        Tree mytree = new ColoradoBlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Star(mytree);
        System.out.println(mytree.getDescription());
        Tree mytree2 = new FraserFir();
        mytree2 = new Lights(mytree2);
        mytree2 = new Star(mytree2);
        mytree2 = new RedBalls(mytree2);
        mytree2 = new Ribbons(mytree2);
        mytree2 = new Lights(mytree2);
        System.out.println(mytree2.getDescription());
        Tree mytree3 = new DouglasFir();
        mytree3 = new BlueBalls(mytree3);
        mytree3 = new Ribbons(mytree3);
        mytree3 = new Ruffles(mytree3);
        mytree3 = new Ribbons(mytree3);
        mytree3 = new LEDs(mytree3);
        System.out.println(mytree3.getDescription());
        Tree mytree4 = new BalsamFir();

        mytree4 = new Star(mytree4);
        mytree4 = new LEDs(mytree4);
        System.out.println(mytree4.getDescription());
  }
}