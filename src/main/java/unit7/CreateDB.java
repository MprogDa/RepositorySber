package unit7;

import java.sql.*;


/**
 * Класс для создания базы данных
 */
public class CreateDB {
    private static final String URL = "jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1";
    private static final String USER = "sa";
    private static final String PASSWORD = "";

    /**
     * Создает таблицу ToDoList
     */
    public void getDB() {
        String sql = "CREATE TABLE IF NOT EXISTS ToDoList (" +
                "id INT PRIMARY KEY AUTO_INCREMENT, " +
                "name VARCHAR(100) NOT NULL, " +
                "status VARCHAR(20) DEFAULT 'не выполнено')";
        try (Connection connection = connect();
             Statement statement = connection.createStatement()) {
            statement.execute(sql);
        } catch (SQLException e) {
        }
    }

    /**
     * Устанавливает соединение
     */
    public Connection connect() throws SQLException {
         return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}