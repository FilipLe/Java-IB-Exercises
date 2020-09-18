import java.util.Scanner;
public class Area {
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);

        System.out.println("Input width:");
        String text1 = scan.nextLine();
        Integer width = Integer.parseInt(text1);
        //What you can do is this too
        //int width = scan.nextInt();
        //However scan.nextInt() doesn't scan the Enter key
        //So if a user types a number and presses Enter, there will be a bug

        System.out.println("Input length:");
        String text2 = scan.nextLine();
        Integer length = Integer.parseInt(text2);
        //int length = scan.nextInt(); 

        int area = length*width;
        int perimeter = (length+width)*2;
        System.out.println("Area of rectangle:"+area);
        System.out.println("Perimeter of rectangle:"+perimeter);
	}
}
