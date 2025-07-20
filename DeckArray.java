
package deckarray;


public class DeckArray {

    
    public static void main(String[] args) {
        
        int[] deck = new int[52];
        for(int i =0; i <=deck.length-1;i++){
            deck[i] = i;
        }
        
        
        int spades = (int) (Math.random()*100)%(13);
        int heart = 13+(int) (Math.random()*100)%(12);
        int diamond = 26+(int) (Math.random()*100)%(12);
        int clubs = 38+(int) (Math.random()*100)%(13);
        
        System.out.println(deck[spades]);
        System.out.println(deck[heart]);
        System.out.println(deck[diamond]);
        System.out.println(deck[clubs]);
    }
    
}
