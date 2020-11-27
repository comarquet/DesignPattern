import java.util.ArrayList;

public class Subject {
    private int subjectState;
    private ArrayList<AbstractObserver> observers = new ArrayList<AbstractObserver>();

    public void attach(AbstractObserver observer) {
        this.observers.add(observer);
    }

    public void notifyObservers(int val) {
        for (AbstractObserver observer : this.observers) {
            observer.update(val);
        }
    }

    public void setState(int val) {
        subjectState = val;
        this.notifyObservers(val);
    }
}
