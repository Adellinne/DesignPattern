class Device implements Observer
{
    private String name;

    public Device(String name)
    {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name + " a primit mesajul: " + message);
    }
}