import java.util.Scanner;

public class nimGame
{
    public String game()
    {
        boolean tracker = true; 
        nimBoard nim = new nimBoard();
        Scanner myObj = new Scanner(System.in);
        int number = 0;
        


        while (tracker == true)
        {
            System.out.println(nim.getCard() + " cards remain");
            if (number % 2 == 0)
            {
                System.out.println("Player 1 please eneter in your number");
            }
            else {
                System.out.println("Player 2 please eneter in your number");
            }

            String userInput = myObj.nextLine();
        }
        return "test";
    }
}