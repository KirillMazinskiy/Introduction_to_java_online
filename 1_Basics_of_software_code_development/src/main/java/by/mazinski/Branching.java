package by.mazinski;

import java.util.Scanner;

public class Branching
{
    public static void calculateFirstTask()
    {
        final int DEGREE = 180;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a first angle: ");
        int firstAngle = in.nextInt();

        System.out.print("Enter a second angle: ");
        int secondAngle = in.nextInt();

        boolean checkExistence = (firstAngle + secondAngle >= DEGREE) && (secondAngle > 0) && (firstAngle > 0);

        try
        {
            if (!checkExistence) throw new Exception("Your triangle doesnt exist!!!");

            System.out.println("Does your triangle exist? " + checkExistence);

            boolean checkRectangularity = (firstAngle == 90||secondAngle == 90);
            System.out.println("Does your triangle Rectangular? " + checkRectangularity);
        }
        catch (Exception ex)
        {
            System.out.print(ex.getMessage());

        }

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

        System.out.print("Input fourth double number: ");
        double d = in.nextDouble();

        double firstMin = FindMin(a,b);
        double secondMin = FindMin(c,d);

        double max = firstMin;
        if (firstMin<secondMin) max = secondMin;

        System.out.println("The maximum of two minimums is:" + max);


    }

    public static void calculateThirdTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first(x) double сordinate for point A: ");
        double x1 = in.nextDouble();
        System.out.print("Input second(y) double сordinate for point A:");
        double y1 = in.nextDouble();

        System.out.print("Input first(x) double сordinate for point B: ");
        double x2 = in.nextDouble();
        System.out.print("Input second(y) double сordinate for point B:");
        double y2 = in.nextDouble();

        System.out.print("Input first(x) double сordinate for point C: ");
        double x3 = in.nextDouble();
        System.out.print("Input second(y) double сordinate for point C:");
        double y3 = in.nextDouble();

        //x1 != x2 != x3 and y1 != y2 != y3
        boolean firstCheckOnOneLine = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);

        boolean secondCheckOnOneLine = ((x1 == x2) && (x2 == x3))||((y1 == y2) && (y2 == y3)) ;

        if (firstCheckOnOneLine||secondCheckOnOneLine) System.out.println("Yes! Points A, B, C belong to one line");
        else System.out.println("No! Points A, B, C dont belong to one line");


    }

    public static void calculateFourthTask ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first(x) double value for size of hole: ");
        double x = in.nextDouble();
        System.out.print("Input second(y) double value for size of hole:");
        double y = in.nextDouble();

        System.out.print("Input first(x) double value for size of object: ");
        double a = in.nextDouble();
        System.out.print("Input second(y) double value for size of object: ");
        double b = in.nextDouble();
        System.out.print("Input third(z) double value for size of object: ");
        double c = in.nextDouble();

        if(ValidatiorForTaskFourth(x, y, a, b)||ValidatiorForTaskFourth(x, y, b, c)||ValidatiorForTaskFourth(x, y, a, c))
            System.out.println("Yes, you can put your object");
        else System.out.println("No, you cant put your object");
    }

    public static void calculateFifthTask ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value  : ");
        double x = in.nextDouble();

        double y = 0;

        if (x <= 3) y = Math.pow(x,2) - 3*x +9;
        else y = 1/(Math.pow(x,3)+ 6);

        System.out.println(y);
    }

    private static double FindMin(double x, double y)
    {
        if (x < y) return  x;
        return y;
    }

    private static boolean ValidatiorForTaskFourth(double x, double y, double a, double b)
    {
        if( x >= 0 && y >= 0 && a >= 0 && b >= 0) return ((a <= x && b <= y)||(a <= y && b <= x));
        return false;
    }
}
