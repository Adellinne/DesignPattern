import org.json.JSONObject;

class C2
{
    private JSONObject json;

    public C2(String jsonString)
    {
        json = new JSONObject(jsonString);
    }

    public int getNumber(String key)
    {
        return json.getInt(key);
    }
}
