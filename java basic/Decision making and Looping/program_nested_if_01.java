// Program to find nested if statements.
// I think this was the nice example which is given in book page 1-42.
public class program_nested_if_01 {
    public static void main(String[] args) {


        int number = -52;
        System.out.println("Number is :"+number);

        if(number > 0 ) //1
        if(number%2 == 0)
            System.out.println("It is positive & even");

        if(number < 0 ) //2
        if(number%2 == 0)
                System.out.println("It is negative & even");


        if(number > 0 ) //3
            if(number%2 != 0)
                System.out.println("It is positive & odd");

        if(number < 0 ) //4
            if(number%2 != 0)
                System.out.println("It is negative & odd");

    }
}
