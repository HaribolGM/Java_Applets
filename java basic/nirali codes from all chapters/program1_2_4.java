// Program 1 : Circle specification using methods

import java.io.*;
import java.util.*;

class Circle
{
            int radius;
            float perimeter;
            float area;
            void input()


            {
                Scanner s = new Scanner(System.in);
                System.out.println("Enter radius : ");
                radius = Integer.parseInt(s.nextLine());

            }


            void calculate()

            {
                final float pi = 3.14f;
                perimeter = 2.0f * pi * (float) radius ;
                area = pi * (float) (radius * radius);
                System.out.println("Perimeter : "+perimeter);
                System.out.println("Area : "+area);

            }

}

class OurCircle
{
    public static void main(String[] args) {
        Circle c = new Circle();
        c.input();
        c.calculate();

    }
}
