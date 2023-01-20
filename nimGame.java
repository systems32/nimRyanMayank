import java.util.Scanner;

public class nimGame
{
    public void game()
    {
        nimBoard nim = new nimBoard();
        Scanner myObj = new Scanner(System.in);
        boolean valid;
        int number = 0;
        


        while (true)
        {
            System.out.println("------------------------------------------------------------------");
            String result = (number % 2 == 0) ? "Player 1 please eneter in your number; " : "Player 2 please eneter in your number; ";
            System.out.println(result + nim.getCard() + " cards remain");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Number: ");

            String userInput = myObj.nextLine();
            try
            {
                valid = nim.runGame(Integer.valueOf(userInput));
                int addResult = (valid == true) ? 1 : 0;
                number += addResult;
            }
            catch (Exception e)
            {
                System.out.println("------------------------------------------------------------------");
                System.out.println("Please type in a number, don't enter a word or letter.");
            }
            if (nim.getCard() == 0) {break;}
        }
        System.out.println("------------------------------------------------------------------");
        String result = (number % 2 == 0) ? "Player 1 wins!" : "Player 2 wins!";
        System.out.println(nim.getCard() + " cards remain! " + result);

    }
}