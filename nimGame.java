import java.util.Scanner;

public class nimGame
{
    nimBoard nim = new nimBoard();
    Scanner myObj = new Scanner(System.in);
    boolean valid;
    
    public void game(int randomNum, String p1Name, String p2Name)
    {   
        nim.setNum();
        while (true)
        {
            System.out.println("------------------------------------------------------------------");
            System.out.println(randomNum);
            String result = (randomNum % 2 == 0) ? p1Name + " please eneter in your number; " : p2Name + " please eneter in your number; ";
            System.out.println(result + nim.getCard() + " cards remain");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Number: ");
            

            String userInput = myObj.nextLine();
            try
            {
                valid = nim.runGame(Integer.valueOf(userInput));
                int addResult = (valid == true) ? 1 : 0;
                randomNum += addResult;
            }
            catch (Exception e)
            {
                System.out.println("------------------------------------------------------------------");
                System.out.println("Please type in a number, don't enter a word or letter.");
            }
            if (nim.getCard() == 0) {break;}
        }
        System.out.println("------------------------------------------------------------------");
        String result = (randomNum % 2 == 0) ? p1Name + " wins!" : p2Name + " wins!";
        System.out.println(nim.getCard() + " cards remain! " + result);

    }
}