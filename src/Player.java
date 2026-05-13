public class Player {
    public int cardTotal;
    public boolean isBust;
    public Card[] hand;
    public boolean isHit;
    public String name;

    //todo: make constructor with no parameters that sets defaults for the instance variables

    // todo: make a print that prints all the instance variables

    public Player(){
    cardTotal = 2;
    isBust = false;
    isHit = false;
    name = "Hubert";

    }
    public void printInfo () {
        System.out.println("I have " + cardTotal + " cards. " + "I did not " + suit + " is worth " + value + " points!");

    }
}


