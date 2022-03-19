package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = x2 - x1;
        double result1 = y2 - y1;
        double result2 = Math.pow(result, 2) + Math.pow(result1, 2);
        return Math.sqrt(result2);
    }

    public static void main(String[] args) {

        double result = Point.distance(1, 1, 3, 4);
        System.out.println("result (1, 1) to (3, 4) " + result);
        double result1 = Point.distance(2, 3, 5, 7);
        System.out.println("result (2, 3) to (5, 7) " + result1);
    }
}
