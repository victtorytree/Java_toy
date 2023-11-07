public class Toy {
    private String name;
    private int id;
    private double weight;
    private int quantity;
    
    public Toy(String name, int id, double weight, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Toy " + name + ", id=" + id + ", weight=" + weight + "]";
    }
    
}
