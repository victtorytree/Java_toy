import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class ToyShop {
    double call = 0;
    private Queue<Toy> toys;
    public Comparator<Toy> compareToy = new Comparator<>(){
        @Override
        public int compare(Toy o1, Toy o2) {
            return (int) (o2.getWeight() - o1.getWeight());
        }
    };

    public ToyShop() {
        toys = new PriorityQueue<>(compareToy);
    }
    public void addToy(Toy toy) {
        toys.add(toy);
    }
    public void showToys() {
        int a = toys.size();
        for (int i = 0; i < a; i++) {
            System.out.println(toys.poll());
        }
    }
    public void getToy() {
        call += 1;
        Toy chosenToy = null;
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        double number = totalWeight/call;
        System.out.println(number);
        
        for (int i = 0; i < toys.size(); i++) {
            Toy x = toys.peek();
           if (x.getWeight()<number) {
                chosenToy = x;
                break;
           }
           else {
                toys.poll();
           }
        }
        
        if(chosenToy != null) {
            System.out.println("Вы выиграли игрушку! " + chosenToy);
            if (chosenToy.getQuantity()==0) {
                System.out.println("К сожалению, данные игрушки закончились");
            }
            else {
                chosenToy.setQuantity(chosenToy.getQuantity() -1);
            }
        }
        else { 
            System.out.println("Ничего не выиграли");
        }  
    }
}
