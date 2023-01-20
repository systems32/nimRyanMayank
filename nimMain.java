import java.util.Scanner;

public class nimMain {
    public static void main(String[] args) {
        boolean tracker = true;
        Scanner myObj = new Scanner(System.in);
        nimGame nim = new nimGame();
        

        System.out.println("Welcome to nim! By Ryan Lin and Mayank");

        while (tracker == true)
        {
            System.out.println("If you would like to begin please type start. Otherwise type quit.");
            String userInput = myObj.nextLine(); 
            if (userInput.equals("start")){
                System.out.println(nim.game());
            }
            else if (userInput.equals("quit")){
                System.out.println("Thank you for playing");
                tracker = false;
            }
            
        }
        

    }
}
