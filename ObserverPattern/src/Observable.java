public interface Observable {
    public void addObservers(Observer o);
    public void removeObservers(Observer o);
    public void notifyObservers();
}