package unit7;
import java.sql.*;
import java.util.*;

/**
 * Класс для управления списком задач
 */
public class ToDoList {
    private CreateDB db;

    public ToDoList() {
        db = new CreateDB();
        db.getDB();
    }

    /**
     * Добавляет новую задачу
     */
    public void addToDo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("название задачи: ");

        String name = scanner.nextLine();

        try (Connection connection = db.connect();
             PreparedStatement statement = connection.prepareStatement("INSERT INTO ToDoList(name) VALUES(?)")) {
            statement.setString(1, name);
            statement.executeUpdate();
            System.out.println("Задача добавлена\n----");
        } catch (SQLException e) {
            System.out.println("Ошибка");
        }
    }

    /**
     * Отображает список задач
     */
    public void showToDo() {
        try (Connection connection = db.connect();
             Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM ToDoList")) {

            if (!rs.isBeforeFirst()) {
                System.out.println("задач нет");
                return;
            }

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String status = rs.getString("status");
                System.out.printf("ID: %d, Имя: %s, Статус: %s \n", id, name, status);
            }
            System.out.println("----");
        } catch (SQLException e) {
            System.out.println("Ошибка");
        }
    }

    /**
     * Отмечает задачу как выполненную
     */
    public void doneToDo() {
        Scanner scanner = new Scanner(System.in);

        showToDo();

        System.out.print("id задачи: ");

        int id = scanner.nextInt();

        scanner.nextLine();

        try (Connection connection = db.connect();
             PreparedStatement statement = connection.prepareStatement("UPDATE ToDoList SET status='выполнено' WHERE id=?")) {

            statement.setInt(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Ошибка");
        }
    }

    /**
     * Удаляет задачу
     */
    public void delToDo() {
        Scanner scanner = new Scanner(System.in);

        showToDo();

        System.out.print("id задачи для удаления: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try (Connection con = db.connect();
             PreparedStatement stmt = con.prepareStatement(
                     "DELETE FROM ToDoList WHERE id=?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Ошибка");
        }
    }
}