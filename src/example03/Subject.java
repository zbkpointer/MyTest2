package example03;

public interface Subject {
    void registerObserver(Observer o);
    public void deleteObserver(Observer o);
    void notifyObservers();
}
