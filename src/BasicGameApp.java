import java.util.Base64;
import java.util.Scanner;

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
        p1 = new Player();
        d1 = new Dealer();

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
        //give the player cards
        p1.hand[0] = deck[0];
        p1.hand[1] = deck[1];

        d1.hand[0] = deck[2];
        d1.hand[1] = deck[3];
        //todo hw: give the dealer 2 cards

        //ask the user questions
        Scanner s = new Scanner(System.in);
        System.out.println("What is your name?");
        String aName = s.nextLine();
        System.out.println(aName);
        p1.name = aName;
        p1.calculateTotal();
        p1.printInfo();
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
