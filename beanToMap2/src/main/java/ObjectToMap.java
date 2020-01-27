import btm.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;
import java.util.Map;

public class ObjectToMap {

    public static void main(String[] args) {

        ObjectMapper oMapper = new ObjectMapper();

        Student obj = Student.builder().build();
        obj.setName("mkyong");
        obj.setAge(34);
        obj.setSkills(Arrays.asList("java", "node"));

        // object -> Map
        Map<String, Object> map = oMapper.convertValue(obj, Map.class);
        System.out.println(map);

    }

}
