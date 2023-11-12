
public class Main {
    public static void main(String[] args) {
        ToyShop shop = new ToyShop();
        shop.addToy(new Toy("Matreshka", 23, 30, 3));
        shop.addToy(new Toy("Stepashka", 233, 20, 1));
        shop.addToy(new Toy("Fairy", 111, 12, 3));
        shop.addToy(new Toy("Crocodile", 17, 15, 1));
        shop.addToy(new Toy("Buratino", 80, 8, 2));
        shop.addToy(new Toy("Pirate", 3, 10, 7));
        int i = 0;
        while (i<10) {
             shop.getToy();
             i++;
        }
    }
}