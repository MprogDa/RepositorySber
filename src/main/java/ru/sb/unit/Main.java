package ru.sb.unit;
import java.util.Scanner;

import unit1.Unit1;
import unit2.StartUnit2;

public class Main {
    public static void main(String[] args) {
        System.out.print("Выбор задания\n1. Unit1 (25.06.2025 - 10 заданий)\n2. Unit2 (26.06.2025 - 5 классов)\nЗадание: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a){
            case 1:
                Unit1.startUnit1();
                break;
            case 2:
                StartUnit2.Start();
                break;
            default:
                System.out.print("Такого задания нет");
                break;
        }

    }
}