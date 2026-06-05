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
    hand = new Card[0];

//    for (int w = 0; w < hand.length; w++) {
//            hand = new Card[w];
//    }


    }
    public void addCard(Card c){
        Card[] bigger = new Card [hand.length+1];
        for(int i = 0; i<hand.length; i++){
            bigger [i] = hand [i];
        }
        bigger[hand.length] = c;
        hand = bigger;
    }


    public void printInfo () {
        System.out.println("You have " + cardTotal + " points.");
        System.out.println("It is " + isBust + " that you busted.");
        //System.out.println("It is " + isHit + " that I want to hit.");
        //System.out.println("My name is " + name + ".");
        for(int x = 0; x < hand.length; x++){
            hand[x].printInfo();
        }
    }
    //todo: make a method called calculateTotal()
    public void calculateTotal(){
        int addValue = 0;
        int aceCount = 0;
        for(int d = 0; d < hand.length; d++) {
            addValue = addValue + hand[d].value;
            if (hand[d].name.equals("Ace")){
                aceCount++;
            }
        }
        while(addValue > 21 && aceCount > 0){
            for(int d = 0; d < hand.length; d++){
                if (hand[d].name.equals("Ace") && hand[d].value == 11){
                    hand[d].value = 1;
                    break;
                }
            }
            addValue = addValue - 10;
            aceCount--;
        }
        cardTotal = addValue;
        if(cardTotal> 21){
            isBust = true;
        }

    }

}


