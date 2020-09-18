import java.util.Scanner;
public class JavaPractice2
{
    public static int amount;
    public static int amount1;
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        //Task 1 --> Add all square numbers from 1^2 to 100^2
        int sum = 0;
        for(int i = 1;i < 101;i++)
        {
            sum += Math.pow(i,2);
        }
        System.out.println("Sum of all square numbers from 1^2 to 100^2: "+ sum);

        //Task 2 --> How many of the numbers between 10 and 100 are factors of 74529?
        int count = 0;
        for(int i = 10;i<100;i++)
        {
            if(74529%i==0)
            {
                count+=1;
            }
        }
        System.out.println("Amount of numbers between 10 and 100 are factors of 74529: "+count);

        //Task 3 --> The following 5x5 box is made up of asterisks:
        //*****
        //*****
        //*****
        //*****
        //*****
        //Write a program where the user can enter a number and a box of that size will be generated.
        System.out.println("Enter amount: ");
        String am = scan.nextLine();
        boolean statusAmount = false;
        while(statusAmount==false){
            try{
                amount = Integer.parseInt(am);
                statusAmount = true;
            }catch (NumberFormatException amount) {
                statusAmount=false;
                System.out.println("Please input integer value: ");
                am = scan.nextLine();
            }
        }
        //Outer loop to repeat that inside loop amount times, each time go new line
        //So if amount = 5, inner loop will give '*****'
        //Let x represent '*****'
        //Outer loop gives
        //x
        //x
        //x
        //x
        //x
        for(int i = 0; i < amount; i++)
        {
            //Inside loop to print * amount times horizontally
            //E.g. amount = 5 --> this loop prints *****
            for(int j = 0; j < amount; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }

        //Task 4 --> Task 3 but user is given the choice to have an empty box like following:
        //*****
        //*   *
        //*   *
        //*   *
        //*****
        System.out.println("Enter amount:");
        String am1 = scan.nextLine();
        boolean statusAmount1 = false;
        while(statusAmount1==false){
            try{
                amount1 = Integer.parseInt(am1);
                statusAmount1 = true;
            }catch (NumberFormatException amount1) {
                statusAmount1=false;
                System.out.println("Please input integer value: ");
                am1 = scan.nextLine();
            }
        }
        
    }
}