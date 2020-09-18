import java.util.Scanner;
public class JavaPractice2
{
    public static int amount3;
    public static int amount4;
    public static int amount5;
    public static int terms;
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
        String am3 = scan.nextLine();
        boolean statusAmount3 = false;
        while(statusAmount3==false){
            try{
                amount3 = Integer.parseInt(am3);
                statusAmount3 = true;
            }catch (NumberFormatException amount3) {
                statusAmount3=false;
                System.out.println("Please input integer value: ");
                am3 = scan.nextLine();
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
        for(int i = 0; i < amount3; i++)
        {
            //Inside loop to print * amount times horizontally
            //E.g. amount = 5 --> this loop prints *****
            for(int j = 0; j < amount3; j++)
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
        String am4 = scan.nextLine();
        boolean statusAmount4 = false;
        while(statusAmount4==false){
            try{
                amount4 = Integer.parseInt(am4);
                statusAmount4 = true;
            }catch (NumberFormatException amount4) {
                statusAmount4=false;
                System.out.println("Please input integer value: ");
                am4 = scan.nextLine();
            }
        }

        //Task 5 --> Create a program which creates a right angled triangle using asterisks.
        //The user should choose the triangle’s size. As an example, a triangle of size 5 looks like this:
        //*
        //**
        //***
        //****
        //*****
        System.out.println("Enter amount: ");
        String am5 = scan.nextLine();
        boolean statusAmount5 = false;
        while(statusAmount5==false){
            try{
                amount5 = Integer.parseInt(am5);
                statusAmount5 = true;
            }catch (NumberFormatException amount5) {
                statusAmount5=false;
                System.out.println("Please input integer value: ");
                am5 = scan.nextLine();
            }
        }
        for(int i = 0; i < amount5; i++)
        {
            for(int j = 0; j < i+1; j++)
            {
                //Print * at the current count 'i' horizontally
                System.out.print("*");
            }
            //New line in the loop
            System.out.println("");
        }

        //Task 7 --> A number sequence follows the rule: double, then add 3. It starts with the numbers: 1, 5, 13, 29, 61.
        //What is the 40th number in the sequence?
        System.out.println("Enter nth term: ");
        String term = scan.nextLine();
        boolean statusTerm = false;
        while(statusTerm==false){
            try{
                terms = Integer.parseInt(term);
                statusTerm = true;
            }catch (NumberFormatException terms) {
                statusTerm=false;
                System.out.println("Please input integer value: ");
                term = scan.nextLine();
            }
        }
        int current = 1;
        for(int i = 0; i < terms; i++)
        {
            current = current * 2 + 3;
        }
        System.out.println(current);
    }
}