package unit7;

import java.util.Scanner;

/**
 * Класс для запуска ToDoList
 */
public class StartToDo {
    /**
     * Запускает ToDoList
     */
    public static void startUnit7(){
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        while (true) {
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать задачи");
            System.out.println("3. Выполнить задачу");
            System.out.println("4. Удалить задачу");
            System.out.println("5. Выход");
            System.out.print(":: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    toDoList.addToDo();
                    break;
                case 2:
                    toDoList.showToDo();
                    break;
                case 3:
                    toDoList.doneToDo();
                    break;
                case 4:
                    toDoList.delToDo();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неверный ввод");
            }
        }
    }
}