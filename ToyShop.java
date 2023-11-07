import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop {
    private List<Toy> toys;

    public ToyShop() {
        toys = new ArrayList<>();
    }
    public void addToy(Toy toy) {
        toys.add(toy);
    }
    
    public void getToy() {
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        Random r = new Random();
        double setWeight = r.nextDouble()*totalWeight;
        System.out.println(setWeight);
        Toy chosenToy = null;
        for (Toy toy : toys) {
            if(toy.getWeight()==setWeight) {
                chosenToy = toy;
                break;
            }
        }
        if(chosenToy != null) {
            if(chosenToy.getQuantity()==0) {
                System.out.println("Данные игрушки закончились");
            }
            else {
                System.out.println("Вы выиграли игрушку! " + chosenToy);
                chosenToy.setQuantity(chosenToy.getQuantity() -1);
            }
        }
        else { 
            System.out.println("Ничего не выиграли");
        }
        
    }
}
