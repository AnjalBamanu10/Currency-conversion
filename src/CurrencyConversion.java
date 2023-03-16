import java.util.*;
import java.text.DecimalFormat;
public class CurrencyConversion {
    public static void main(String[] args)
    {
        double amount;
        double rupee, dollar;
        int choice;

        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);

        System.out.println("Following are the Choices:");
        System.out.println("Enter 1: Ruppe");
        System.out.println("Enter 2: Dollar");

        System.out.print("\nChoose from above options: ");
        choice = sc.nextInt();

        System.out.println("Enter the amount you want to convert?");
        amount = sc.nextFloat();

        switch (choice)
        {
            case 1:  // Ruppe Conversion
                dollar = amount / 135.03;
                System.out.println(amount + " Rupee = " + f.format(dollar) + " Dollar");


            case 2:  // Dollar Conversion
                rupee = amount * 135.03;
                System.out.println(amount + " Dollar = " + f.format(rupee) + " Ruppes");


            //Default case
            default:
//                System.out.println("Invalid Input");
        }
    }
}
