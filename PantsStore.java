public class PantsStore extends Store{
    @Override
    public Clothing createClothing() {
        return new Pants();
    }
}
