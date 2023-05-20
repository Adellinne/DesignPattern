class C1Adapter extends C1
{
    private C2 c2;

    public C1Adapter(C2 c2)
    {
        this.c2 = c2;
    }

    @Override
    public void readNumbers()
    {

        int num1 = c2.getNumber("n1");
        int num2 = c2.getNumber("n2");

        setNumbers(num1, num2);
    }

    private void setNumbers(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }
}