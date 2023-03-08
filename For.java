package ru.academits.java;

public class For {
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            if (getNum(i))
                System.out.print(i + " ");
        }
    }

    public static boolean getNum(int i) {
        if (i % 4 == 0)
            return true;
        else
            return false;
    }
}