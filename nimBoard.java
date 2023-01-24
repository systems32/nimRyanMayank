public class nimBoard {
    private int cards;
    private int returnedCard;

    public int removeCard(int cardRemove)
    {
        if ((cardRemove <= (cards/2)) && (cardRemove > 0))
        {
            cards -= cardRemove;
            return cards;
        }
        else if (cards == 1)
        {
            cards = 0;
            return cards;
        }
        else
        {
            return -1;
        }
    }

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

    public int getCard()
    {
        return cards;
    }

    public void setNum()
    {
        cards = (int)(Math.random()*(50-10+1)+10);
    }

}