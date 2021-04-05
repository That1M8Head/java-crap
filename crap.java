import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String welcome = "Welcome to Java Crap!";
        System.out.println(welcome);
        // Java Crap is an experiment to see what I can do with Java.

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Could you tell me your name?");
        String userName = scanObj.nextLine();
        System.out.println("Hi, " + userName + "! \nPick a number, whatever you want!");
        int someNumber = Integer.parseInt(scanObj.nextLine());
        System.out.println(someNumber + "!");
        if (someNumber > 50)
            {
                System.out.println("That's pretty big, isn't it?");
            }
    }
}
