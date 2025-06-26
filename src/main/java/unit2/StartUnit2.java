package unit2;

public class StartUnit2 {
    public static void Start(){
        System.out.println("Класс Phone");
        Phone phone1 = new Phone("2223331122", "Samsung", 12);
        Phone phone2 = new Phone("3332221212", "Samsung");
        Phone phone3 = new Phone();
        System.out.print("Метод receiveCall: ");
        phone1.receiveCall("Человек");
        System.out.print("Метод receiveCall (два параметра): ");
        phone1.receiveCall("Человек", "1112223344");
        System.out.print("Метод toString: ");
        System.out.println(phone1.toString());
        System.out.println();

        System.out.println("Класс Circle");
        Circle circle = new Circle(10.2, "Фиолетовый");
        System.out.println(circle.toString());
        System.out.println();

        System.out.println("Класс Matrix");
        Matrix matrix1 = new Matrix(3, 3);
        Matrix matrix2 = new Matrix(3, 3);
        matrix1.setMatr(0,0, 1);
        matrix1.setMatr(0,1, 2);
        matrix1.setMatr(0,2, 3);
        matrix1.setMatr(1,0, 4);
        matrix1.setMatr(1,1, 5);
        matrix1.setMatr(1,2, 6);
        matrix1.setMatr(2,0, 7);
        matrix1.setMatr(2,1, 8);
        matrix1.setMatr(2,2, 9);

        matrix2.setMatr(0,0, 2);
        matrix2.setMatr(0,1, 2);
        matrix2.setMatr(0,2, 2);
        matrix2.setMatr(1,0, 2);
        matrix2.setMatr(1,1, 2);
        matrix2.setMatr(1,2, 2);
        matrix2.setMatr(2,0, 2);
        matrix2.setMatr(2,1, 2);
        matrix2.setMatr(2,2, 2);

        System.out.println("Матрица 1");
        matrix1.printM();

        System.out.println("Матрица 2");
        matrix2.printM();

        System.out.println("сложение матриц");
        Matrix matrix3 = matrix1.add(matrix2);
        matrix3.printM();

        System.out.println("умножение на число (на 3)");
        Matrix matrix4 = matrix1.mulNum(3);
        matrix4.printM();

        System.out.println("умножение матриц");
        Matrix matrix5 = matrix1.multiply(matrix2);
        matrix5.printM();

        System.out.println();

        System.out.println("Классы Book и Author");
        Author author = new Author("Человеков Человек Человекович", "мужской", "tolstoy@example.com");
        System.out.println(author.toString());
        Book book = new Book("Книга1", author, 2025);
        System.out.println(book.toString());
        System.out.println();

        System.out.println("Класс PizzaOrder");
        PizzaOrder pizzaOrder = new PizzaOrder("Пепперони", Size.MEDIUM, false, "дом 111");
        pizzaOrder.order();
        pizzaOrder.cancel();
        System.out.println(pizzaOrder.toString());

    }
}
