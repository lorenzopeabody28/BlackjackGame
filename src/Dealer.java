public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public Card[] hand;
    public boolean isBust;
    public Dealer(){
        isOver16 = false;
        cardTotal = 0;
        isBust = false;
        hand = new Card[2];
        printInfo();
    }
    public void printInfo () {
        System.out.println("I have " + cardTotal + " points.");
        System.out.println("It is " + isBust + "that I busted.");
        System.out.println("It is " + isOver16 + "that I am over 16.");
        for(int x = 0; x < hand.length; x++){
            System.out.println(x);
        }
    }
    public void calculateTotal(){
        int addValue = 0;
        for(int d = 0; d < hand.length; d++) {
            addValue = addValue + hand[d].value;
        }
        cardTotal = addValue;
    }

}
