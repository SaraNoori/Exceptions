import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String answer = getResponse();
        while (!answer.equals("exit"))
        {
            respond(answer);
            answer = getResponse();
        }
    }

    public static String getResponse()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("give a number:");
        String answer = scan.nextLine();

        return answer;
    }

    public static void respond(String answer)
    {
        int parsed;
        try 
        {
            parsed = Integer.parseInt(answer);
            System.out.println("The factors of " + answer + " are: ");
            factor(parsed);
        }
        catch (NumberFormatException e)
        {
            System.out.println("not a number, please try again");
        }
    }

    public static void factor(int number)
    {

        for (int i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                System.out.print(i + " ");
            }
        }
        // to make client side look neater
        System.out.println();
    }

}
