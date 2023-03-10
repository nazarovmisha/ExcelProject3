
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.List;

public class JsonUtil {
    private JsonUtil() {
    }
public static void sadas(){
    ObjectMapper objectMapper = new ObjectMapper();
    String json;
    json = objectMapper.writeValueAsString();
    System.out.println(json);


}
}