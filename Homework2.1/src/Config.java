import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config
{
    private static Config instance;
    private String color;
    private int weight;

    private Config()
    {
        loadConfigFromFile();
    }

    public static Config getInstance()
    {
        if (instance == null)
        {
            synchronized (Config.class)
            {
                if (instance == null)
                {
                    instance = new Config();
                }
            }
        }
        return instance;
    }
    private void loadConfigFromFile()
    {
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream("config.properties"))
        {
            properties.load(fileInputStream);
            color = properties.getProperty("color");
            weight = Integer.parseInt(properties.getProperty("weight"));
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
    public String getColor()
    {
        return color;
    }
    public int getWeight()
    {
        return weight;
    }
}
