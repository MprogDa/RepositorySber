package unit6.unit6_2.Test;

import unit6.unit6_2.JsonSerializationException;
import unit6.unit6_2.JsonSerializer;
import java.util.List;

public class Test {
    public static void main(String[] args) throws JsonSerializationException {
        Person person = new Person("Alice", 30, List.of("Reading", "Hiking"));
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(person);
        System.out.println(json); // Вывод: {"name":"Alice", "age_years":30, "hobbies":["Reading", "Hiking"]}
    }
}

