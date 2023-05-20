import java.util.ArrayList;
import java.util.List;

class Prelungitor
{
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer)
    {
        observers.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        observers.remove(observer);
    }

    public void notifyObservers(String message)
    {
        for (Observer observer : observers)
        {
            observer.update(message);
        }
    }
    public void plugIn()
    {
        System.out.println("Prelungitorul este conectat la priză.");

        notifyObservers("Prelungitorul este conectat la priză.");
    }

    public void unplug()
    {
        System.out.println("Prelungitorul este deconectat de la priză.");

        notifyObservers("Prelungitorul este deconectat de la priză.");
    }
}
