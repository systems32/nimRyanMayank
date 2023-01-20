public class nimBoard {
    private int cards;
    private int returnedCard;

    public int removeCard(int cardRemove)
    {
        if (cardRemove < (cards/2))
        {
            cards -= cardRemove;
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

}