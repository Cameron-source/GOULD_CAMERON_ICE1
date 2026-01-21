/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//991788225
package card;
import java.util.Scanner;


/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Cameron
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
           
            c.setValue((int) (Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i] = c;
        }
        for (Card card : magicHand)
        {
            System.out.println(card.getSuit()+ " " +card.getValue());
        }
                 
        boolean found = false;
       
        Card guess = new Card();
        System.out.print("Enter a card value (1-13): ");
        guess.setValue(input.nextInt()); 
        System.out.print("Please Enter card suit (0-3 where 0=Hearts, 1=Diamonds, 2=Spades, 3=Clubs): ");
        guess.setSuit(input.nextInt());
        for (Card card : magicHand)
        {
            if((card.getSuit()).equals(guess.getSuit()) && card.getValue() == guess.getValue())
            {
                found = true;
                
            }
            break;
            
        }
        if(found)
        {
            System.out.println("Your card is in the magic hand.");
        }
        else
        {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
      
        }
    
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    