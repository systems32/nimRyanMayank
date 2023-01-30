import java.util.Scanner;

public class nimMain {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        nimGame nim = new nimGame();
        
        // Introduction to the game
        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome to nim! By Ryan Lin and Mayank");
        System.out.println("------------------------------------------------------------------");

        // Asks players to enter names in for the game
        System.out.print("Player 1: Please enter in your name: ");
        String p1Name = myObj.nextLine(); 
        System.out.println("------------------------------------------------------------------");
        System.out.print("Player 2: Please enter in your name: ");
        String p2Name = myObj.nextLine(); 

        while (true)
        {
            //loop to check if the user would like to play the game
            System.out.println("------------------------------------------------------------------");
            System.out.println("If you would like to begin please type start. Otherwise type quit.");
            System.out.println("------------------------------------------------------------------");
            String userInput = myObj.nextLine();

            if (userInput.equals("start")){
                int randomNum = (int) Math.floor(Math.random() * (2) + 1);
                //calls the game method that initiates the game
                nim.game(randomNum, p1Name, p2Name);
            }
            
            // ends loop if the user doesn't want to play, and terminates program
            else if (userInput.equals("quit")){
                System.out.println("Thank you for playing");
                break;
            }
            
        }
        

    }
}
