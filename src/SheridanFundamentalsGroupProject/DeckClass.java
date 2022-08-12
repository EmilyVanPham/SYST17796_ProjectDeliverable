/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheridanFundamentalsGroupProject;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author moosundammy
 * 
 */
public class DeckClass {
  
    //Attributes of class
    private ArrayList<CardsClass> deck;

    //Constructor Class
    public DeckClass(){
        deck = new ArrayList<>();
    }
    
    //Method to create the deck
    public void createDeck(){
        
        //Nested collections Loop to get the suit and number to create the deck
        for (CardsClass.Suits cardSuit: CardsClass.Suits.values()){
            for (CardsClass.Numbers cardNumber: CardsClass.Numbers.values()){ 
               
               //New card
               deck.add(new CardsClass(cardNumber,cardSuit));
            }
        }
    }
    
    //Shuffle deck  
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    //Method to draw a card
    public CardsClass draw(){

        //Taking the first card from the deck
        CardsClass card = new CardsClass(deck.get(0));
        
        //Remove card from the deck
        deck.remove(0);
        
        return card;
    }
    
    //Method to add cards in the array
    public void addCards(ArrayList<CardsClass> cards){
        deck.addAll(cards);
    }
    
    //Method to clear the deck
    public void clearDeck(){
        deck.clear();
    }
}

