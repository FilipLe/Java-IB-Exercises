import java.util.Scanner;
public class Task7 {
    //EXTRA CHALLENGE
    //TASK 7 --> Ask the user for their name and their age. Then ask a series of other yes/no questions such as “do you smoke?”. 
    //Then predict when the year of the user’s death.
    //Declaring global variables for Data Type Validation 
    public static int birthyearInt;
    public static double exerciseAmount;
    public static int cigarettes;
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input name:");
        String nameNew = scan.nextLine();
        System.out.println("Hello "+nameNew+", what's your birthyear?");
        String birthyear = scan.nextLine();
        boolean statusAge = false;
        //Loop to validate data type
        //If user enters invalid data type, an error message 
        //will be displayed instead of the program crashing
        while(statusAge==false){
            try{
                birthyearInt = Integer.parseInt(birthyear);
                statusAge = true;
            }catch (NumberFormatException birthyearInt) {
                statusAge=false;
                System.out.println("Please input integer value: ");
                birthyear = scan.nextLine();
            }
        }
        int ageApprox = 100;
        int subtractAge = 0;
        //Question 1: Exercise amount
        System.out.println("How long do you exercise a day, in hours (could be a decimal: e.g. 30 mins = 0.5 hours):");
        String ex = scan.nextLine();
        boolean statusEx = false;
        //Loop to validate data type
        //If user enters invalid data type, an error message 
        //will be displayed instead of the program crashing
        while(statusEx==false){
            try{
                exerciseAmount = Double.parseDouble(ex);
                statusEx = true;
            }catch (NumberFormatException exerciseAmount) {
                statusEx=false;
                System.out.println("Please input decimal value: ");
                ex = scan.nextLine();
            }
        }
        if(exerciseAmount<0.5)
        {
            subtractAge += 5;
        }
        
        //Question 2: Smoking amount
        System.out.println("Do you smoke?");
        String smokeYN = scan.nextLine();
        smokeYN = smokeYN.toUpperCase();
        //Loop to validate data type
        //If user enters invalid data type, an error message 
        //will be displayed instead of the program crashing
        while(!smokeYN.equals("YES")&&!smokeYN.equals("NO"))
        {
            System.out.println("Please answer with yes or no");
            smokeYN = scan.nextLine();
            smokeYN = smokeYN.toUpperCase();
        }
        if(smokeYN.equals("YES"))
        {
            System.out.println("How many cigarettes do you smoke a day?");
            String smokeAmount = scan.nextLine();
            boolean statusSmoke = false;
            //Loop to validate data type
            //If user enters invalid data type, an error message 
            //will be displayed instead of the program crashing
            while(statusSmoke==false){
                try{
                    cigarettes = Integer.parseInt(smokeAmount);
                    statusSmoke = true;
                }catch (NumberFormatException cigarettes) {
                    statusSmoke=false;
                    System.out.println("Please input integer value: ");
                    smokeAmount = scan.nextLine();
                }
            }
            if(cigarettes<2)
            {
                subtractAge += 3;
            }
            else if(cigarettes>2&&cigarettes<10)
            {
                subtractAge += 5;
            }
            else if(cigarettes>10&&cigarettes<20)
            {
                subtractAge += 15;
            }
            else
            {
                subtractAge += 30;
            }
        }

        //Question 3: Do you eat vegetables?
        System.out.println("Does your meal consists of vegetables?");
        String vegetables = scan.nextLine();
        vegetables = vegetables.toUpperCase();
        //Loop to validate data type
        //If user enters invalid data type, an error message 
        //will be displayed instead of the program crashing
        while(!vegetables.equals("YES")&&!vegetables.equals("NO"))
        {
            System.out.println("Please answer with yes or no");
            vegetables = scan.nextLine();
            vegetables = vegetables.toUpperCase();
        }
        if(vegetables.equals("NO"))
        {
            subtractAge += 5;
        }

        //Evaluation
        int lifeexpectancy = ageApprox - subtractAge;
        int expectedDeathYear = birthyearInt + lifeexpectancy;
        System.out.println("Expected Death Year: "+expectedDeathYear);
    }
}
