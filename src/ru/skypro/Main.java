package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задача 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        int a = 10;
        for (a = 10; a > 0; a--) {
            System.out.print(a + " ");
        }
        //Задача 2
        System.out.println(" ");
        int x = 4; //первая пятница месяца
        for (x = 4; x < 31; x = x + 7) {
            System.out.println("Today is Friday, " + x + "-th. It is necessary to prepare a report.");
        }
        //Задача 3
        int q = 0;
        int z = (2022 - 200);
        int w = (2022 + 100);
        for (q = 0; q < w; q = q + 79) {
        if (q > z)
            System.out.println(q);

        }




    }
}
