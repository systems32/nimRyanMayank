import java.util.Scanner;


public class nimGame
{
    // creating neccessary objects and variables
    nimBoard nim = new nimBoard();
    Scanner myObj = new Scanner(System.in);
    boolean valid;
    
    public void game(int randomNum, String p1Name, String p2Name)
    {   
        // sets the pile
        nim.setNum();
        while (true)
        {
            System.out.println("------------------------------------------------------------------");
            // acts as a cointoss to determine if player 1 or player 2 will go
            System.out.println(randomNum);
            String result = (randomNum % 2 == 0) ? p1Name + " please eneter in your number; " : p2Name + " please eneter in your number; ";
           //promts the user to remove cards
            System.out.println(result + nim.getCard() + " cards remain");
            System.out.println("------------------------------------------------------------------");
            System.out.print("Number: ");
            
            // checks the user input for number of cards removed, makes sure that user inputs numbers only
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
            // ends the loop when the number of cards is equal to 0
            if (nim.getCard() == 0) {break;}
        }
        
        //Prints the winner of the game
        System.out.println("------------------------------------------------------------------");
        String result = (randomNum % 2 == 0) ? p1Name + " wins!" : p2Name + " wins!";
        System.out.println(nim.getCard() + " cards remain! " + result);

    }
}