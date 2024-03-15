public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(Stock stock) {
        System.out.println("Notification pour l'investisseur " + name + ": Le prix de " + stock.getName()
                + " a changé : " + stock.getPrice());
    }
}
