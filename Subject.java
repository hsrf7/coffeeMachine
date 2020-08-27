/*

exposes functinality to create a subject which can
1. register obseervers and hold a list of them
2. remove an observer
3. notify the list of observers about the change

*/

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}