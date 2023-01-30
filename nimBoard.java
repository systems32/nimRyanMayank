public class nimBoard {
    // not instance variables, used for the number of cards and the how many are remianing
    private int cards;
    private int returnedCard;

    // Method to remove the cards from the pile without removing more than half, returns the current amount of cards
    public int removeCard(int cardRemove)
    {
        // makes sure no more than half the pile is removed
        if ((cardRemove <= (cards/2)) && (cardRemove > 0))
        {
            cards -= cardRemove;
            return cards;
        }
        // makes sure the user has to remove only 1 card from the pile
        else if ((cards == 1) && (cardRemove == 1))
        {
            cards = 0;
            return cards;
            
        }
        else
        {
            return -1;
        }
    }

    // method to print out error message to user
    public boolean runGame(int cardRemove)
    {
        returnedCard = removeCard(cardRemove);
        if (returnedCard == -1)
        {
            System.out.println("Please enter in a number no more than half of the total cards and do not enter negative numbers!");
            return false;

        }
        else
        {
            return true;
        }
    }
    //accessor method to get the current number of cards
    public int getCard()
    {
        return cards;
    }

    // sets pile to  a random integer
    public void setNum()
    {
        cards = (int)(Math.random()*(50-10+1)+10);
    }

    //method to set pile to the number of cards chosen by the user
    public void userSetNum(int userNum)
    {
        cards = userNum;
    }

}