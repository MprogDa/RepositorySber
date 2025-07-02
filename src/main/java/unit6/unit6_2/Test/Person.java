package unit6.unit6_2.Test;

import unit6.unit6_2.JsonField;

import java.util.*;

public class Person {
    @JsonField
    private String name;

    @JsonField(name = "age_years")
    private int age;

    @JsonField
    private List<String> hobbies;

    private String password;

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }
}
