import java.util.Scanner;

class C1
{
    private int num1;
    private int num2;
    public void readNumbers()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceți primul număr: ");
        num1 = scanner.nextInt();

        System.out.print("Introduceți al doilea număr: ");
        num2 = scanner.nextInt();
    }

    public int getSum()
    {
        return num1 + num2;
    }
}