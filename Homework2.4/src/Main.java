public class Main
{
    public static void main(String[] args)
    {
        Prelungitor prelungitor = new Prelungitor();

        Device aparat1 = new Device("Aparat 1");
        Device aparat2 = new Device("Aparat 2");
        Device aparat3 = new Device("Aparat 3");

        prelungitor.addObserver(aparat1);
        prelungitor.addObserver(aparat2);
        prelungitor.addObserver(aparat3);

        prelungitor.plugIn();
        prelungitor.unplug();
    }
}