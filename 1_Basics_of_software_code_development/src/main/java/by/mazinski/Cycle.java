package by.mazinski;

import java.util.Scanner;

public class Cycle
{

    public static void calculateFirstTask()
    {
        /* Arithmetic progression, where
         A is the first term of the arithmetic progression,
         D is the step of the arithmetic progression */



        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value: ");
        int value = in.nextInt();

        try
        {
            if (value < 1) throw new Exception("Pls enter positive integer!!!");

            int a = 1;
            int d = 1;

            int n = (value - a) / d + 1;


            System.out.println("Sum : " + Cycle.calculateSumArithmeticProgression(a, d, n));

        }
        catch (Exception ex)
        {
            System.out.print(ex.getMessage());

        }

    }

    public static void calculateSecondTask()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the start of the interval a : ");
        double a = in.nextDouble();

        System.out.print("Enter the end of the interval b : ");
        double b = in.nextDouble();

        System.out.print("Enter the step h: ");
        double h = in.nextDouble();

        boolean check = Math.abs(b - a) > h && a < b;

        try
        {
            if (!check) throw new Exception("Check input data !!!");

            for(double value = a; value < b; value += h)
            {
                if(value > 2) System.out.println("Value of function on step: " +  value);
                else System.out.println("Value of function on step: " + (-value) );
            }

        }
        catch (Exception ex)
        {
            System.out.print(ex.getMessage());

        }

    }

    public static void calculateThirdTask()
    {
        double sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            sum =+ Math.pow(i, 2) + sum;

        }
        System.out.println("Sum : " + sum);
    }

    public static void calculateFourthTask ()
    {
        double product = 1;
        for (int i = 1; i <= 200; i++)
        {
            product = Math.pow(i, 2) * product;

        }
        System.out.println("Product : " + product);
    }

    public static void calculateFifthTask ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value E: ");
        double value = in.nextDouble();


        double a = 1.0 / 3.0 + 0.5;
        double bn = 0;
        double cn = 0;
        double sum = 0;

        try
        {
            if (value > a) throw new Exception("Pls enter E less then 0,8!");

            if (value < 0) sum  = 0.5 / (1 - 0.5) + 1.0 / 3.0 /(1 - 1.0 / 3.0);
            else
            for (int i = 1; a > value; i++)
            {
                bn = Math.pow(0.5, i);
                System.out.println("Value b: " + bn);
                cn = Math.pow(1.0 / 3.0 , i);
                System.out.println("Value c: " + cn);
                a = bn + cn;
                if (value < a) sum += a;
            }

            System.out.println("Value sum: " + sum);

        }
        catch (Exception ex)
        {
            System.out.print(ex.getMessage());

        }

    }

    public static void calculateSixthTask ()
    {
        char charsSigns  = '\u0000';
        int charsNumber = 0;

        for (int i = 0; i<= 10000; i++)
        {
            charsSigns++;
            charsNumber++;
            System.out.println("sign: " + charsSigns + "  number: " + charsNumber);
        }

    }

    public static void calculateSeventhTask ()
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a value m: ");
        int m = in.nextInt();
        System.out.print("Enter a value n: ");
        int n = in.nextInt();

        try
        {
            if (m > n) throw new Exception("Pls enter correct n and m!!!");

            for (; m <= n; m++)
            {
                int k = 0;
                System.out.println("For :" + m);

                for(int j = 2; j < n; j++)
                {
                    if (m % j == 0 && m != j)
                    {
                        k++;
                        System.out.println("Divider :" + j);
                    }

                }
                if (k == 0) System.out.println(m + " is Prime number");
            }

        }
        catch (Exception ex)
        {
            System.out.print(ex.getMessage());

        }

    }

    public static void calculateEithTask ()
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number a: ");
        String a = scanner.nextLine();

        System.out.println("Enter number b: ");
        String b = scanner.nextLine();

        for (int f = 0; f < a.length(); f++)
        {
            a.charAt(f);
        }

        for (int g = 0; g < b.length(); g++)
        {
            b.charAt(g);
        }

        System.out.println("The same numbers from two lines is: ");

        for (int i = 0; i < a.length(); i++)
        {
            for (int j = 0; j < b.length(); j++)
            {
                if (a.charAt(i) == b.charAt(j))
                {
                    System.out.print(" " + b.charAt(j));
                }
            }
        }
    }

    private static double calculateSumArithmeticProgression(int a, int d, int n)
    {
        double sum = ((double)(2 * a + d * (n - 1)) / 2) * n;

        return sum;
    }
}
