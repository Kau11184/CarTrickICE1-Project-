/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;

/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author jobanpreetkaur june1
 */
public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Card[] magicHand = new Card[7]; //Array of object
        Random random = new Random();
        
        for( int i=0;i<magicHand.length;i++)
        {
            Card c = new Card();
            int num = random.nextInt(13)+ 1;
            int num2 = random.nextInt(4);
            
            c.setValue(num);
            c.setSuits(Card.SUITS[num2]);
            //use a method to generate random *13
            //random method suit 
        }
        
        //step 2:take input 
        Scanner input = new Scanner(System.in);
        Card c2 = new Card();
        
        System.out.println("Pick a card : ");
        int num3 = input.nextInt();
        
        System.out.println("Pick a suit: ");
        String suits = input.next();
        
        c2.setValue(num3);
        c2.setSuits(suits);
        
        
        
        for(Card y:magicHand){
            if(c2==y){
                boolean right =true;
        }
        }
        
        if(right==true) {
            System.out.println("Match found");   
        }
        
        else {
            System.out.println("Sorry, no match");
        }
    }
}
    
    

