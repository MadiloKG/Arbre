public class Main {
    public static void main(String[] args) {
        // Création d'instances d'investisseurs
        Investor investor1 = new Investor("Madilo");
        Investor investor2 = new Investor("Shisui");

        // Création d'une instance de marché boursier
        StockMarket stockMarket = new StockMarket();

        // Ajout des investisseurs comme observateurs
        stockMarket.addObserver(investor1);
        stockMarket.addObserver(investor2);

        // Simulation des changements de prix des actions
        Stock stock = new Stock("La BMW M5", 1500.0);
        stockMarket.setStock(stock);

        // Changement de prix
        stock.setPrice(2000.0);
        stockMarket.setStock(stock);
    }
}
