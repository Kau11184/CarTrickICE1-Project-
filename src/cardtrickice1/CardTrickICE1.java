/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;
import java.util.Random;

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
        Card[] magicHand = new Card[7];//Array of object
        Scanner input=new Scanner(System.in);
        Random random = new Random();
        
        for( int i=0;i<magicHand.length;i++)
        {
            int val=random.nextInt(13)+1;
            String suit=Card.SUITS[random.nextInt(4)];
            Card card = new Card(val,suit);
            magicHand[i]=card;
        }
            
        System.out.println("The following Cards are generated:");
        for(Card magicHand1:magicHand){
            System.out.println(magicHand1.getValue()+":"+magicHand.getSuits());
        }
            
       
        System.out.println("Pick your Suit Number");
        for(int i=0;i<Card.SUITS.length;i++)
        {
            System.out.println((i+1)+" : "+Card.SUITS[i]);
        }
        int suitValue=input.nextInt()-1;
        System.out.println("Enter Card Value");
        int cardValue=input.nextInt();
        Card match = new Card(cardValue,Card.SUITS[suitValue]);
        boolean found=false;
        for(Card card:magicHand)
        {
            if(card.getValue()==match.getValue()&& card.getSuits().equals(match.getSuits());
            {
                found=true;
                break;
            }
        }
        
        
        
        
        if(found==false) {
            System.out.println("Match found");   
        }
        
        else {
            System.out.println("Sorry, no match");
        }
    }
}
    
    

