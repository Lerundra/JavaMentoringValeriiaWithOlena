package com.example.helloworld;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.Math.sqrt;

public class HelloWorld {
    public static void helloWorldTask()  {
        String myName = "Lera";
        String startDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd MM yyyy"));
        System.out.println("Task 0. Hello, my name is " + myName + "!" + " " + "I've started learn some Java " + startDate);

    }

    public static double circleAreaAndPerimeter() {
        int radius = 5;
        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Task 1. The area of circle is: " + area);
        System.out.println("        The perimetr of circle is: " + perimeter);
        return area;
    }
    public static void averageOfTheNumbers() {
        int a = 2;
        int b = 3;
        int c = 4;
        int d = 1;
        int e = 5;
        double avarage = (a + b + c + d + e)/5 ;
        System.out.println("Task 2. Average of five numbers: " + avarage);
    }

    public static void swapValuesFistMethod() {
        int a = 2;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Task 3. Way 1. Swipped value a = " + a);
        System.out.println("               Swipped value b = " + b);
    }
    public static void swapValuesSecondMethod() {
        int a = 2;
        int b = 3;
        int c = b;
        System.out.println("Task 3. Way 2. Method 2 Swipped value a = " + c);
        c = a;
        System.out.println("               Swipped value b = " + a);
    }
    public static void areaOfHexagon(){
        double s = 10;
        //double area = (6 * s*s)/(4* tan(Math.PI/6));
        double area = ((3* sqrt(3))/2)*(s*s);
        System.out.println("Task 4. Area of hexagon is: " + area);
    }
    public static void oddNumbers(){
        int[] array;
        array = new int[100];
        System.out.println("Task 5.");
    for (int i=1; i<array.length; i= i +2){
        System.out.println(i);
        }
    }
    public static void task6(){
        int[] array;
        array = new int[101];
        System.out.println("Task 6.");
        for (int i=1; i<array.length; i++)
            {
                if (i%3==0 && i%5==0){
                    System.out.println("Fizz Buzz " + i);
                }
                else if (i%5==0){
                    System.out.println("Buzz " + i);
                }
                else if (i%3==0){
                    System.out.println("Fizz " + i);
                }
            }
}
    public static void task7(){
        // Write a Java program to test that a given array of integers of length 5 contains a 4 or a 7.
        int[] array;
        array = new int[5];
        for (int i = 0; i <=array.length; i++) {
            if (i==4 || i==7 )
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        //helloWorldTask();
        //circleAreaAndPerimeter();
        //averageOfTheNumbers();
        //swapValuesFistMethod();
        //swapValuesSecondMethod();
        //areaOfHexagon();
        //oddNumbers();
        //task6();
        task7();
    }
}

