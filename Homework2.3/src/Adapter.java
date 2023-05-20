class Adapter
{
    private C3Nr c3Nr;
    public Adapter()
    {
        c3Nr = new C3Nr();
    }

    public int calculeazaSuma(int a, int b) {
        int c = 0;
        return c3Nr.calculeazaSuma(a, b, c);
    }
}
