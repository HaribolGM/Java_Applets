// Program 2 : Program to find min and maximum number using methods.

import javax.imageio.stream.ImageInputStream;
import java.io.*;
import java.util.*;

class Number
{
    int max(int x , int y)
    {
        if(x>y)
            return(x);
        else
            return(y);

    }

    int min(int x , int y)
    {
        if(x<y)
            return (x);
        else
            return(y);

    }
}

    class MaxMin
    {
        public static void main(String[] args) {

            int a, b;
            int mx, mn;
            Number n = new Number();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter first number : ");
            a = s.nextInt();
            System.out.println("Enter second number : ");
            b = s.nextInt();

            mx = n.max(a,b);
            System.out.println("Maximum : "+mx);
            mn = n.min(a,b);
            System.out.println("Minimum : "+mn);
        }
    }