import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;

public class JsonUtil {
    public static void fdgd() {
        String jsonString = "asasa";

        System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(new JsonParser().parse(jsonString)));
    }
}