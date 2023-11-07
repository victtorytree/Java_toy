
public class Main {
    public static void main(String[] args) {
        ToyShop shop = new ToyShop();
        shop.addToy(new Toy("Matreshka", 23, 3, 3));
        shop.addToy(new Toy("Stepashka", 233, 2, 1));
        shop.addToy(new Toy("Fairy", 111, 12, 3));
        shop.addToy(new Toy("Crocodile", 17, 5, 1));
        shop.addToy(new Toy("Buratino", 80, 4, 2));
        shop.addToy(new Toy("Pirate", 3, 4, 7));
        shop.getToy();
    }
}