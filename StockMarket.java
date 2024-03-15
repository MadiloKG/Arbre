import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    private List<Observer> observers;
    private Stock stock;

    public StockMarket() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStock(Stock stock) {
        this.stock = stock;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stock);
        }
    }
}
