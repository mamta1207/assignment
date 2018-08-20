import java.util.Scanner;
class Reverse
 {

    public static void main(String[] args)
 {

        int num , reversed = 0;

     System.out.println("Enter a number to reverse");
      Scanner in = new Scanner(System.in);
      num = in.nextInt();


        while(num != 0)
       {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}