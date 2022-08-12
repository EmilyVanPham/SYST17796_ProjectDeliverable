/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author moosundammy
 *         thithanhvanpham
 */
public class Hand {

    //Atributes
    ArrayList<Cards> hand;

    //Contructor
    public Hand(){
        hand = new ArrayList<Cards>();
    }
    
    //Draw from deck
    public void drawDeck(Deck deck){
        hand.add(deck.draw());
    }
    
    //Return the sum on the hand
    public int getValueHand(){
        int number = 0, ace =0;
         
        //For loop statement to sum the card values
        for (Cards card: hand){
            switch (card.getNumbers()){
                case ACE: ace++; break;
                case TWO: number += 2; break;
                case THREE: number += 3; break;
                case FOUR: number += 4; break;
                case FIVE: number += 5; break;
                case SIX: number += 6; break;
                case SEVEN: number += 7; break;
                case EIGHT: number += 8; break;
                case NINE: number += 9; break;
                case TEN: number += 10; break;
                case JACK: number += 10; break;
                case QUEEN: number += 10; break;
                case KING: number += 10; break;
            }
            for (int i = 0; i < ace; i++){
                if(number <= 10){
                    number += 11;
                }else{
                     number += 1;
                }
                }
            }
            return number;
        }
    
    //Get a card
    public Cards getCard(int i){
        return hand.get(i);
    }
    
    //Clear hand
    public void clearHand(){
        hand.clear();
    }
    
    //String output
    @Override
    public String toString(){
        String output = "";
        for(Cards card: hand){
        output += card + "\n";
    }
    return output;
}
}

