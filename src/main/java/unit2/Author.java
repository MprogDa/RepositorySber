package unit2;

public class Author {
    private String name;
    private String gender;
    private String email;

    public Author(String name, String gender, String email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Автор: " + " имя- " + name + " пол- " + gender + " email- " + email;
    }
}
