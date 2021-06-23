package assignments;
import java.util.Scanner;
public class A7Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isSplit;
        System.out.println("Number of people entered");
        int numberPeople = input.nextInt();
        System.out.println("Enter the check amount ");
        double checkAmount = input.nextDouble();
        System.out.println("Enter service quality");
        System.out.println("Either poor,fair,good,great,excellent");
        String serviceQuality = input.next();
        System.out.println("Split or not Split, enter true or false");
        isSplit = input.nextBoolean();
        tipCalculator( isSplit, numberPeople,checkAmount,serviceQuality);
        input.close();
    }
    public static void tipCalculator(boolean isSplit,int numberPeople,double checkAmount,String serviceQuality){
        double tippercent=0;
        if (serviceQuality.equals("poor"))
        {
            tippercent = 0.05;
        }
        else if (serviceQuality.equals("fair"))
        {
            tippercent = 0.10;
        }
        else if (serviceQuality.equals("good"))
        {
            tippercent = 0.15;
        }
        else if (serviceQuality.equals("great"))
        {
            tippercent = 0.20;
        }
        else if (serviceQuality.equals("excellent"))
        {
            tippercent = 0.25;
        }
        else
        {
            System.out.println("ERROR!!!");
        }

        double tip = tippercent * checkAmount;
        double totalAmount = tip + checkAmount;
        double perPerson = totalAmount / numberPeople;
        double perPersonTip = tip / numberPeople;
        System.out.println("number of people = " + numberPeople);
        System.out.println("total amount = " + totalAmount);
        System.out.println("total tip = " + tip);
        if (isSplit == true)
        {
            System.out.println("total per person = " + perPerson);
            System.out.println("tip per person = " + perPersonTip);
        }
        else
        {
            System.exit(0);

        }
    }
}