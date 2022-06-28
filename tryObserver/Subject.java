package tryObserver;

public abstract class Subject {
	abstract void register(Observer observer);
	abstract void unregister(Observer observer);
	abstract void notifyObservers();
}