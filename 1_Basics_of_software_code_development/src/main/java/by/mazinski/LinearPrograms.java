package by.mazinski;

import java.util.Scanner;

public class LinearPrograms {

    public static void calculateFirstTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first double number(For example 1,7): ");
        double a = in.nextDouble();

        System.out.print("Input second double number: ");
        double b = in.nextDouble();

        System.out.print("Input third double number: ");
        double c = in.nextDouble();

        double z = 0.0;

        z = (a - 3)* b / 2 + c;

        System.out.println(z);
    }

    public static void calculateSecondTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first double number(For example 1,7): ");
        double a = in.nextDouble();

        System.out.print("Input second double number: ");
        double b = in.nextDouble();

        System.out.print("Input third double number: ");
        double c = in.nextDouble();

        double value = 0.0;
        double underRoot = Math.pow(b, 2) - 4 * a * c;

        try
        {
            if (underRoot < 0.0) throw new Exception("The value under root cant be less then 0!!!");
            value = (b + underRoot)/(2*a)- Math.pow(a,3)*c + Math.pow(b,-2);
            System.out.println("Value is : " + value);
        }
        catch (Exception ex)
        {
            System.out.print(ex.getMessage());

        }

    }

    public static void calculateThirdTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first double number(For example 1,7): ");
        double x = in.nextDouble();

        System.out.print("Input second double number: ");
        double y = in.nextDouble();

        try
        {
            double value = (Math.sin(x) + Math.cos(y))/(Math.cos(x)-Math.sin(y)) * Math.tan(x*y);
            System.out.println("Value is : " + value);
        }
        catch (ArithmeticException ex)
        {
            System.out.print(ex.getMessage());
        }

    }

    public static void calculateFourthTask ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a double number like 111,222 : ");
        double value = in.nextDouble();

        int n = ((int)value%10);

        int d = (int)(value*10)%10;

        try
        {
            if (value != n*111 + d*0.111) throw new Exception("Wrong input number!!!");
            value = d*111 + n*0.111;
            System.out.println("Value is : " + value);
        }
        catch (Exception ex) {
            System.out.print(ex.getMessage());


        }
    }

    public static void calculateFifthTask ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a past seconds  : ");
        int value = in.nextInt();

        int hours = value/3600;
        int minutes = value/60 - hours*60;
        int sec = value - hours*3600 - minutes*60;
        System.out.print("HH: " + hours + " MM: "+ minutes+" SS: "+ sec);
    }

    public static void calculateSixthTask ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first integer number: ");
        int x = in.nextInt();

        System.out.print("Input second integer  number: ");
        int y = in.nextInt();

        System.out.println("Your cordinate: "+ x + "," + y);

        boolean check = (x < 2 && x > -2 && y > 0 && y < 4)||(x < 4 && x > -4 && y < 0 && y > -3);

        System.out.println("Is your coordinate in the range? " + check);

    }

}



