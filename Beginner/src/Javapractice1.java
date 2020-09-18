import java.util.Scanner;
import java.lang.Math;
public class Javapractice1
{
    //Declaring global variables for Data Type Validation
    public static int num1;//task3
    public static int num2;//task3
    public static int current;//task4
    public static double currentDec;//task5
    public static double pounds;//task6
    //Main method
    public static void main(String[]args)
    {
        //Initialize input method using Scanner class
        Scanner scan = new Scanner(System.in);
        //TASK 1 --> Print Hello World
        System.out.println("Hello World");

        //TASK 2 --> Ask for user's name
        System.out.println("What's your name?");
        String name = scan.nextLine();
        System.out.println("Greetings "+name);

        //TASK 3 -->ask the user for two integer numbers and them prints the sum of them.
        System.out.println("Please enter two integer numbers.");
        System.out.println("Enter num1:");
        String text1 = scan.nextLine();
        boolean num1Status = false;
        while(num1Status==false){
            try{
                num1 = Integer.parseInt(text1);
                num1Status = true;
            }catch (NumberFormatException num1) {
                num1Status=false;
                System.out.println("Please input integer value: ");
                text1 = scan.nextLine();
            }
        }

        System.out.println("Enter num2:");
        String text2 = scan.nextLine();
        boolean num2Status = false;
        while(num2Status==false){
            try{
                num2 = Integer.parseInt(text2);
                num2Status = true;
            }catch (NumberFormatException num2) {
                num2Status=false;
                System.out.println("Please input integer value: ");
                text2 = scan.nextLine();
            }
        }
        int sum = num1 + num2;
        System.out.println("Sum of two numbers:"+sum);

        //TASK 4 -->user can enter a long list of numbers. 
        //The user should be able to enter a ‘0’ to indicate that the list has ended, at which point the program will print the total.
        System.out.println("Enter a series of numbers. Program will output total.");
        System.out.println("Enter '0' to indicate stop.");
        int total = 0;
        boolean status = true;
        while(status==true)
        {
            System.out.println("Input number:");
            String numInput = scan.nextLine();
            if(numInput.equals("0"))
            {
                status = false;
            }
            else
            {
                boolean currentStatus = false;
                while(currentStatus==false){
                    try{
                        current = Integer.parseInt(numInput);
                        currentStatus = true;
                    }catch (NumberFormatException current) {
                        currentStatus=false;
                        System.out.println("Please input integer value: ");
                        numInput = scan.nextLine();
                    }
                }
                total += current;
            }
        }
        System.out.println("Total of the numbers the user input: "+total);

        //TASK 5--> Adaptation of Task 4, but with decimals
        System.out.println("Enter a series of numbers. Program will output total.");
        System.out.println("Enter '0' to indicate stop.");
        double totalDec = 0.0;
        boolean statusDec = true;
        while(statusDec==true)
        {
            System.out.println("Input number:");
            String numInput = scan.nextLine();
            if(numInput.equals("0"))
            {
                statusDec = false;
            }
            else
            {
                boolean decStatus = false;
                while(decStatus==false){
                    try{
                        currentDec = Double.parseDouble(numInput);
                        decStatus = true;
                    }catch (NumberFormatException currentDec) {
                        decStatus=false;
                        System.out.println("Please input integer value: ");
                        numInput = scan.nextLine();
                    }
                }
                totalDec += currentDec;
            }
        }
        System.out.println("Total of the numbers the user input: "+totalDec);

        //TASK 6 --> Currency converter (GBP to PLN, USD, EUR)
        System.out.println("Currency converter (GBP to PLN, USD, EUR)");
        System.out.println("Input amount, in GBP: ");
        String textPounds = scan.nextLine();
        boolean poundsStatus = false;
        while(poundsStatus==false){
            try{
                pounds = Double.parseDouble(textPounds);
                poundsStatus = true;
            }catch (NumberFormatException pounds) {
                poundsStatus = false;
                System.out.println("Please input integer value: ");
                textPounds = scan.nextLine();
            }
        }

        System.out.println("Enter the currency you want to convert to: ");
        System.out.println("Enter PLN to convert to Polish Złoty.");
        System.out.println("Enter USD to convert to US Dollars.");
        System.out.println("Enter EUR to convert to Euros.");
        String currency = scan.nextLine();
        currency = currency.toUpperCase();
        while(!currency.equals("PLN")&&!currency.equals("EUR")&&!currency.equals("USD"))
        {
            System.out.println("Please input EUR, PLN, or USD.");
            currency = scan.nextLine();
            currency = currency.toUpperCase();
        }
        double result = 0.0;
        if(currency.equals("PLN"))
        {
            result = pounds * 4.89806;
            System.out.println(pounds + " GBP = " + result +" PLN");
        }
        else if(currency.equals("USD"))
        {
            result = pounds * 1.29342;
            System.out.println(pounds + " GBP = " + result +" PLN");
        }
        else
        {
            result = pounds * 1.09974;
            System.out.println(pounds + " GBP = " + result +" EUR");
        }
    }
}