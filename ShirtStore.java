public class ShirtStore extends Store{
    @Override
    public Clothing createClothing() {
        return new Shirt();
    }
}
