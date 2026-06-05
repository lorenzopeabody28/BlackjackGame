public class Dealer {
    public boolean isOver16;
    public int cardTotal;
    public Card[] hand;
    public boolean isBust;
    public Dealer(){
        isOver16 = false;
        cardTotal = 0;
        isBust = false;
        hand = new Card[0];
        printInfo();
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
        System.out.println("They have " + cardTotal + " points.");
        System.out.println("It is " + isBust + " that they busted.");
        System.out.println("It is " + isOver16 + " that they are equal to or over 16.");
        for(int x = 0; x < hand.length; x++){
            hand[x].printInfo();
        }
    }
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
        if(cardTotal >= 16){
            isOver16 = true;
        }
    }
}