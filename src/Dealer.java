public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public Card[] hand;
    public boolean isBust;
    public Dealer(){
        isOver16 = false;
        cardTotal = 2;
        isBust = false;
        hand = new Card[2];
        printInfo();
    }
    public void printInfo () {
        System.out.println("I have " + cardTotal + " cards.");
        System.out.println("It is " + isBust + "that I busted.");
        System.out.println("It is " + isOver16 + "that I am over 16.");
        for(int x = 0; x < hand.length; x++){
            System.out.println(x);
        }
    }
}
