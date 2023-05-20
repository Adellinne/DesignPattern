import org.json.JSONObject;

public class Main
{
    public static void main(String[] args)
    {

        String jsonString = "{\"n1\": 10, \"n2\": 5}";
        C2 c2 = new C2(jsonString);
        C1Adapter c1Adapter = new C1Adapter(c2);
        c1Adapter.readNumbers();

        int sum = c1Adapter.getSum();

        System.out.println("Suma numerelor: " + sum);
    }
}
