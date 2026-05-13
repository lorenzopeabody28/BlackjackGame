import java.util.Base64;

public class BasicGameApp {
    public Card[] deck;
    public Player p1;
    public Dealer d1;
    public boolean gameOn;
    //Player p1 = new Player();
    //Dealer d1 = new Dealer();

    //todo: Print deck method, finish if statements in Card class (eliminate nulls)

    public static void main(String[] args) {
        BasicGameApp a = new BasicGameApp();
    }
    public BasicGameApp() {
        System.out.println("Welcome to Blackjack!");
        deck = new Card[52];
        int cardIndex = 0;
        for(int y = 0; y<4; y++) {
            for (int x = 0; x < 13; x++) {
                deck[cardIndex] = new Card(10, x, y);
                cardIndex++;
                //deck[x].printInfo();
            }
        }
        shuffle();
        printDeck();
    }
    public void printDeck(){
        for (int x = 0; x < deck.length; x++) {
                deck[x].printInfo();
        }
    }
    public void shuffle(){
        for (int w = 0; w < deck.length; w++) {
            int randy = (int)(Math.random()*52);
            Card helper = deck[randy];
            deck[randy] = deck[w];
            deck[w] = helper;
        }
    }
}
