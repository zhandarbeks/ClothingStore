public abstract class Store {
    public Clothing orderClothing() {
        Clothing clothing = createClothing();
        clothing.prepare();
        return clothing;
    }
    public abstract Clothing createClothing();
}
