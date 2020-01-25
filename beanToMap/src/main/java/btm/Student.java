package btm;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Student {

    private String name;
    private int age;
    private List<String> skills;

    // getters setters
}