import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
class ArrayStatistics {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double sum = 0;
    double min = Integer.MAX_VALUE;
    double max = Integer.MIN_VALUE;
    double ac = 1;
    double dc = 1;
    boolean flag1  = true;
    boolean flag2 = true;
    System.out.println("How long do you want the array?");
    int x = scan.nextInt();
    if(x > 0)
    {
        double [] arr = new double [x];
        for(int i = 0; i < x; i++)
    {
        System.out.println("Enter a number");
        double c = scan.nextDouble();
        arr [i] = c;
    }
    System.out.print("Your array is {");
        for(int i = 0; i < x; i++)
    {
            if(i == x - 1)
            {
                System.out.print(arr[i]);
            }
            else
            {
                System.out.print(arr[i] + ", ");
            }
    }
    System.out.print("}");
    for(int i = 0; i < x; i++)
    {
        sum += arr[i];
    }
    System.out.println("\nThe average is " + (sum/x));
    for(int v = 0; v < x; v++)
    {
           if(arr[v] >= max)
           {
               max = arr[v];
           }
           if(arr[v] <= min)
           {
               min = arr[v];
           }
    }
    System.out.println("The range is " + (max - min));
    double prev = arr[0];
    for(int e = 1; e < x; e++)
    {
        if(arr[e] >= prev)
            {
            ac++;
            prev = arr[e];}
            if(arr[e] <= prev-1)
        {
                dc++;
                prev = arr[e];}
    }
    if(ac == x)
            System.out.println("The array is sorted in increasing order");
            else if (dc==x-1)
            System.out.println("The array is sorted in decreasing order");
            else if (ac!=x || dc!=x-1)
            System.out.println("The array is unsorted");
   }
        else 
        {
            System.out.println("Not a valid length!");
        }
}
}