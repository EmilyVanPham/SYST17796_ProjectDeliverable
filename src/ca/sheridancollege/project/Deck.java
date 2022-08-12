/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author moosundammy
 *         thithanhvanpham
 * 
 */
public class Deck {
  
    //Attributes of class
    private ArrayList<Cards> deck;

    //Constructor Class
    public Deck(){
        deck = new ArrayList<>();
    }
    
    //Method to create the deck
    public void createDeck(){
        
        //Nested collections Loop to get the suit and number to create the deck
        for (Cards.Suits cardSuit: Cards.Suits.values()){
            for (Cards.Numbers cardNumber: Cards.Numbers.values()){ 
               
               //New card
               deck.add(new Cards(cardNumber,cardSuit));
            }
        }
    }
    
    //Shuffle deck  
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    //Method to draw a card
    public Cards draw(){

        //Taking the first card from the deck
        Cards card = new Cards(deck.get(0));
        
        //Remove card from the deck
        deck.remove(0);
        
        return card;
    }
    
    //Method to add cards in the array
    public void addCards(ArrayList<Cards> cards){
        deck.addAll(cards);
    }
    
    //Method to clear the deck
    public void clearDeck(){
        deck.clear();
    }
}

