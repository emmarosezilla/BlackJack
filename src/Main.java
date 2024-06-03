public class Main {

    public Card[] deck; // (1): declares an array of cards
    public Player player1; // declare a player
    public Player[] players;
    // future me needs to make an array of Player called players

    public static void main(String[] args) {
        Main m = new Main();
    }

    public Main() {
        System.out.println("this round of blackjack is starting!");
        deck = new Card[52]; // (2): construct deck
        int counter = 0;
        for (int y = 1; y < 5; y++) {
            for (int x = 1; x < 14; x++) {
                Card c = new Card(x, y);
                deck[counter] = c;
                counter++;
            }

        }
        shuffleCards();
        //   printDeck();
        // con\]\struct player1
        // future me needs to construct players array
        player1 = new Player();
        players = new Player[4];
        // fill players array

        for(int p = 0; p < 4; p++){
            players[p] = new Player();
        }
        dealCards();
    }


    public void shuffleCards() {
        for (int x = 0; x < 52; x++) {
            Card temp = deck[x];
            int r = (int) (Math.random() * 52);
            deck[x] = deck[r];
            deck[r] = temp;
        }
    }

    public void dealCards() {
        for (int r = 0; r < player1.hand.length; r = r + 1) {
            players[r].hand[r] = deck[r];
        }
        for (int x = 0; x < 4; x = x + 1) {
            players[x].printHand();
        }
    }

    public void printDeck() {
        for (int x = 0; x < 52; x = x + 1) {
            deck[x].printCard();
        }
    }

}