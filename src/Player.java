public class Player {
    public int points;
    public Card [] hand;
    public Player(){
        hand = new Card[2];
        // printHand();
    }

    public void printHand(){
        for (int x = 0; x < hand.length; x++){
            System.out.println(x);
            hand[x].printCard();
        }
    }

}




