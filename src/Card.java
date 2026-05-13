public class Card {
    public int value;
    public String name;
    public String suit;

    public Card(int pValue, int pName, String pSuit) {
        value = pValue;
        if(pName == 0){
            name = "Ace";
            value = 11;
        } else if(pName ==1){
            name = "two";
            value = 2;
        }
        else if(pName ==2){
            name = "two";
            value = 2;
        }
        else if(pName ==3){
            name = "three";
            value = 3;
        }
        else if(pName ==4){
            name = "four";
            value = 4;
        }
        else if(pName ==5){
            name = "five";
            value = 5;
        }
        else if(pName ==6){
            name = "six";
            value = 6;
        }
        else if(pName ==7){
            name = "seven";
            value = 7;
        }
        else if(pName ==8){
            name = "eight";
            value = 8;
        }
        else if(pName ==9){
            name = "nine";
            value = 9;
        }
        else if(pName ==10){
            name = "ten";
            value = 10;
        }
        else if(pName ==11){
            name = "Jack";
            value = 11;
        }
        else if(pName ==12){
            name = "Queen";
            value = 12;
        }
        else if(pName ==13){
            name = "King";
            value = 13;
        }
        suit = pSuit;
    }
        public void printInfo(){
            System.out.println("The " + name + "of " + suit + "is worth " + value + "points!");

    }
}
