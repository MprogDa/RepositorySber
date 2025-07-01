package ru.sb.unit;
import java.util.Scanner;

import unit1.Unit1;
import unit2.StartUnit2;
import unit3.PaintExample;
import unit4.Unit4Main;
import unit5.unit5_4.TextCount;

public class Main {
    public static void main(String[] args) {
        System.out.print("Выбор задания\n1. Unit1 (25.06.2025 - 10 заданий)\n2. Unit2 (26.06.2025 - 5 классов)\n3. Unit3 (27.06.2025 - классы с наследованием)\n4. Unit4 (30.06.2025 - shell)\n5. Unit5 (01.07.2025)\nЗадание: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 1:
                Unit1.startUnit1();
                break;
            case 2:
                StartUnit2.Start();
                break;
            case 3:
                PaintExample.pointMain();
                break;
            case 4:
                Unit4Main.unit4Start();
                break;
            case 5:
                System.out.println(TextCount.count("./src/main/java/unit5/unit5_4/text.txt"));
                break;
            default:
                System.out.print("Такого задания нет");
                break;
        }

    }
}