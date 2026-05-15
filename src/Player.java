public class Player {
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;
    public boolean isHit;
    public String name;

    //todo: make constructor with no parameters that sets defaults for the instance variables

    // todo: make a print that prints all the instance variables

    public Player(){
    cardTotal = 0;
    isBust = false;
    isHit = false;
    name = "Hubert";
    hand = new Card[2];

    }
    public void printInfo () {
        System.out.println("I have " + cardTotal + " cards.");
        System.out.println("It is " + isBust + "that I busted.");
        System.out.println("It is " + isHit + "That I want to hit.");
        System.out.println("My name is " + name + ".");
        for(int x = 0; x < hand.length; x++){
            hand[x].printInfo();
        }
    }
    //todo: make a method called calculateTotal()
    public void calculateTotal(){
        int addValue = 0;
        for(int d = 0; d < hand.length; d++) {
            addValue = addValue + hand[d].value;
        }
        cardTotal = addValue;
    }
}


