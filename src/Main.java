public class Main {

    public Card[] deck; // (1): declares an array of cards
    public static void main(String[] args) {
        Main m = new Main();


    }
    public Main(){
        System.out.println("this round of blackjack is starting!");
        deck = new Card [52]; // (2): construct deck
        int counter = 0;
        for (int y = 1; y < 5; y++) {
            for (int x = 1; x < 14; x++) {
               Card c = new Card(x, y);
               deck[counter] = c;
               counter ++;
            }

        }
        shuffleCards();
        printDeck();
        dealCards();
    }


    public void shuffleCards(){
        for (int x = 0; x < 52; x ++ ) {
            Card temp = deck [x];
            int r = (int) (Math.random() * 52);
            deck[0] = deck[r];
            deck[r] = temp;

        }
    }

    public void printDeck(){
        for (int x =0; x <52; x=x+1){
            deck[x].cardInfo();
        }
    }

    public void dealCards(){

    }
}
