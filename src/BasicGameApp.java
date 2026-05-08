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
    public BasicGameApp(){
        System.out.println("Welcome to Blackjack!");
        deck = new Card[52];

        for(int x = 0; x < 13; x++){
            deck[x] = new Card(10,x, "Hearts");
            deck[x].printInfo();
        }



    }
}
