class ScrewDriver extends WorkTool {
    public ScrewDriver(String name, int productionYear) {
        super(name, productionYear);
    }

    @Override
    void use() {
        System.out.println("Uzyto screwdriver " + name + " rok produkcji " + productionYear);
    }
}
