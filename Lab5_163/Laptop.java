public class Laptop implements IProduct {
    private String name;
    private String description;
    private double price;

    public Laptop(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void display() {
        System.out.println("Laptop: " + name + " , Description: " + description + " , Price: BDT " + price);
    }
}
