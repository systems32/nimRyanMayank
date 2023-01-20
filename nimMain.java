import java.util.Scanner;

public class nimMain {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        nimGame nim = new nimGame();
        
        System.out.println("------------------------------------------------------------------");
        System.out.println("Welcome to nim! By Ryan Lin and Mayank");

        while (true)
        {
            System.out.println("------------------------------------------------------------------");
            System.out.println("If you would like to begin please type start. Otherwise type quit.");
            System.out.println("------------------------------------------------------------------");
            String userInput = myObj.nextLine(); 

            if (userInput.equals("start")){
                nim.game();
            }
            else if (userInput.equals("quit")){
                System.out.println("Thank you for playing");
                break;
            }
            
        }
        

    }
}
