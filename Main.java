package ru.vsu.cs.kislova;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Введите длину стороны квадрата: a = ");
        double a = readLenght();

        double squareX = calculateSquare(a);

        writeArea(a, squareX);
    }

    private static double readLenght() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }

    private static double calculateSquare(double a) {
        double squareSquare = a * a;
        double r = a/2;
        double squareRound = Math.PI * r * r;

        return (squareSquare - squareRound)/2 + squareRound;

    }

    private static void writeArea(double a, double squareX) {
        System.out.printf("Для квадрата со стороной a = %1$.03f площадь закрашенной" +
                " фигуры squareX = %2$.06f%n", a, squareX);
    }
}
