class Hammer extends WorkTool {
    public Hammer(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    void use() {
        System.out.println("Uzyto hammer " + name + " z rokiem produkcji " + productionYear);
    }
}
