/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author moosundammy
 */
public class CardsClass {
    
    //Attributes of class
    private Numbers numbers;
    private Suits suits;
    
    //Enumeration for number values
    public enum Numbers{ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;}
          
    //Enumeration for suits
    public enum Suits{HEART, CLUB, SPADE, DIAMOND;}
    
    //Constructor
    public CardsClass (Numbers numbers, Suits suits){
        this.numbers = numbers;
        this.suits = suits;
    }
    
    //Constructor overflow 
    public CardsClass(CardsClass card){
        this.suits = card.getSuits();
        this.numbers = card.getNumbers();
    }   
    
    //Getters methods
    public Numbers getNumbers(){return this.numbers;}
    public Suits getSuits(){return this.suits;}
        
    //ToString method to return the complete card
    @Override
    public String toString(){
        return getNumbers() + " of " + getSuits();
    }
    
}
