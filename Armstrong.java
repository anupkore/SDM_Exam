import java.util.Scanner;

public class Armstrong 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt() ; 
        int originalNumber=0;
        int remainder=0;
        int result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}