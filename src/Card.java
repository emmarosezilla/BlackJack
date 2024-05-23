public class Card {
    public int cardNum;
    public int chips;
    public String cardSuit;
    public String cardName;
    public int cardValue;

    public Card(int paramCardNum, int paramCardSuit){
        cardNum = paramCardNum;
      //cardSuit = paramCardSuit;

        if (paramCardSuit ==1){
            cardSuit = "spades";
        }
        if (paramCardSuit ==2){
            cardSuit = "hearts";
        }
        if (paramCardSuit == 3){
            cardSuit = "clubs";
        }
        if (paramCardSuit == 4){
            cardSuit = "diamonds";
        }

        if (cardNum == 1) {
            cardName = "ace";
            cardValue = 11;
        }
        if (cardNum == 2) {
            cardName = "two";
            cardValue = 2;
        }
        if (cardNum == 3) {
            cardName = "three";
            cardValue = 3;
        }
        if (cardNum == 4) {
            cardName = "four";
            cardValue = 4;
        }
        if (cardNum == 5) {
            cardName = "five";
            cardValue = 5;
        }
        if (cardNum == 6) {
            cardName = "six";
            cardValue = 6;
        }
        if (cardNum == 7) {
            cardName = "seven";
            cardValue = 7;
        }
        if (cardNum == 8) {
            cardName = "eight";
            cardValue = 8;
        }
        if (cardNum == 9) {
            cardName = "nine";
            cardValue = 9;
        }
        if (cardNum == 10) {
            cardName = "ten";
            cardValue = 10;
        }
        if (cardNum == 11) {
            cardName = "jack";
            cardValue = 10;
        }
        if (cardNum == 12) {
            cardName = "queen";
            cardValue = 10;
        }
        if (cardNum == 13) {
            cardName = "king";
            cardValue = 10;
        }

    }

    public void cardInfo(){
        System.out.println(cardName + " of " + cardSuit);
               // "\n, it is worth " + cardValue + " points!");
    }


}
