package unit1;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Random;

public class Unit1 {

    static public void startUnit1(){
        while(true){
            System.out.print("\nНомер задания (1-10) (0 - завершение): ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            switch (n){
                case 1:
                    hello();
                    break;
                case 2:
                    num();
                    break;
                case 3:
                    pal();
                    break;
                case 4:
                    sumN();
                    break;
                case 5:
                    moon();
                    break;
                case 6:
                    numS();
                    break;
                case 7:
                    fib();
                    break;
                case 8:
                    chr();
                    break;
                case 9:
                    ur();
                    break;
                case 10:
                    rim();
                    break;
                case 0:
                    return;
                default:
                    System.out.print("Такого задания нет");
                    break;
            }
        }

    }

    /*
    1 Напишите программу, которая выводит строку «Hello World!» в консоль.
    */
    static private void hello(){
        System.out.println("Hello World!");
    }

    /*
    2 В переменных a и b хранятся два натуральных числа. Напишите программу,
    выводящую на экран результат деления a на b с остатком.
    Пример работы программы (a = 21, b = 8): « 21 / 8 = 2 и 5 в остатке »
    */
    static private void num(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Натуральное число a: ");
        int a = scanner.nextInt();
        System.out.print("Натуральное число  b: ");
        int b = scanner.nextInt();

        if(a < 0 || b < 0){
            System.out.println("Неверные значения (a или b < 0)");
            return;
        }

        int n = a/b;
        int o = a%b;

        System.out.println(a + " / " + b + " = " + n + " и " + o + " в остатке");
    }

    /*
    3 Напишите программу, который будет проверять, является ли веденное
    пользователем число палиндромом (одинаково читающееся в обоих направлениях).
    */
    static private void pal(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int n = scanner.nextInt();
        String str = Integer.toString(n);


        for(int i = 0; i != str.length()/2; i++){
            if(str.charAt(i) == str.charAt(str.length()-1-i)){
            }
            else {
                System.out.println("число не палиндром");
                return;
            }
        }
        System.out.println("число палиндром");
    }

    /*
    4 В переменной n хранится натуральное трёхзначное число.
    Создайте программу, вычисляющую и выводящую на экран сумму цифр n.
    */
    static private void sumN(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int n = scanner.nextInt();

        if(n < 100 || n > 999){
            System.out.println("Неверные значения (n должно быть трехзначным)");
            return;
        }

        int n1 = n/100;
        int n2 = (n/10)%10;
        int n3 = n%10;

        System.out.println("Сумма цифр: " + (n1+n2+n3));
    }

    /*
    5 Сила тяжести на Луне составляет примерно
    17% от силы тяжести на Земле. Напишите программу,
    которая вычисляет и выводит в консоль вес на Луне,
    основываясь на введенном пользователем в консоль весе на планете Земля.
    */
    static private void moon(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("вес на земле: ");
        double n = scanner.nextDouble();
        System.out.println("вес на луне: " + n * 0.17 + " кг");
    }

    /*
    6 Проверьте, является ли введённое пользователем с клавиатуры натуральное число
    — простым. Постарайтесь не выполнять лишних действий (например, после того,
    как вы нашли хотя бы один нетривиальный делитель уже ясно, что число составное
    и проверку продолжать не нужно).
    */
    static private void numS(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("число не простое");
            return;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("число не простое");
                    return;
                }
            }
        }
        System.out.println("число простое");
    }

    /*
    7 Выведите на экран первые n членов последовательности Фибоначчи,
    где n запрашивается у пользователя посредством консоли (2 < n < 100).
    */
    static private void fib(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int n = scanner.nextInt();

        if(n < 2 || n > 100){
            System.out.print("Неверные значения (2 < n < 100)");
            return;
        }

        BigInteger num1 = BigInteger.ZERO;
        BigInteger num2 = BigInteger.ONE;
        System.out.print("Последовательность Фибоначчи: " + num1 + " " + num2);
        for (int i = 2; i < n; i++) {
            BigInteger num3 = num1.add(num2);
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
        }
    }

    /*
    8 Создайте простую игру, основанную на угадывании букв.
    Пользователь должен угадать загаданную букву A-Z введя ее в консоль. Если пользователь угадал букву,
    то программа выведет «Right» и игра закончится, если нет, то пользователь продолжит вводить буквы. (Опционально)
    Вывести: «You’re too low», - если пользователь ввел букву меньше загаданной «You’re too high»,
    - если пользователь ввел букву больше загаданной
    */
    static private void chr(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char cr = (char)(random.nextInt(26) + 65);

        while (true) {
            System.out.print("Буква: ");
            char n = scanner.next().toUpperCase().charAt(0);

            if (n == cr) {
                System.out.println("Right");
                return;
            }
            else if (n < cr) {
                System.out.println("You're too low");
            }
            else {
                System.out.println("You're too high");
            }
        }

    }

    /*
    9 В три переменные a, b и c записаны три вещественных числа. Создать программу,
    которая будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0, либо сообщать, что корней нет.
    */
    static private void ur(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextDouble();
        System.out.print("b: ");
        double b = scanner.nextDouble();
        System.out.print("c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D > 0) {
            double x1 = (-b + Math.sqrt(D)) / (2 * a);
            double x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x = -b / (2 * a);
            System.out.println("один корень: x = " + x);
        }
        else {
            System.out.println("корней нет");
        }
    }

    /*
    10.	Напишите программу, принимающую на вход натуральное число в десятичной
    системе счисления (не более 100) и выводит его же, но в римской записи
    */
    static private void rim(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Число: ");
        int n = scanner.nextInt();

        if(n < 1 || n > 99){
            System.out.println("Неверные значения (0 < n < 100)");
            return;
        }

        String str = "";
        if (n >= 90) {
            str += "XC";
            n -= 90;
        }
        else if (n >= 50) {
            str += "L";
            n -= 50;
            while (n >= 10) {
                str += "X";
                n -= 10;
            }
        }
        else if (n >= 40) {
            str += "XL";
            n -= 40;
        }
        else if (n >= 10) {
            str += "X";
            n -= 10;
            while (n >= 10) {
                str += "X";
                n -= 10;
            }
        }

        if (n == 9) {
            str += "IX";
            n -= 9;
        }
        else if (n >= 5) {
            str += "V";
            n -= 5;
            while (n >= 1) {
                str += "I";
                n -= 1;
            }
        }
        else if (n == 4) {
            str += "IV";
            n -= 5;
        }
        else if (n >= 1) {
            str += "I";
            n -= 1;
            while (n >= 1) {
                str += "I";
                n -= 1;
            }
        }

        System.out.println(str);


    }
}
