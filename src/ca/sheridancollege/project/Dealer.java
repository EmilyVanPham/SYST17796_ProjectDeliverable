/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

/**
 *
 * @author moosundammy
 *         thithanhvanpham
 */
public class Dealer extends Player{
    
    //Set the Dealer name
    public Dealer(){
        super.setName("Dealer");
    }
        
    //Display the dealer hand without the second card
    public void dealerHand(){
        System.out.println("Dealer hand is:");
        System.out.println(super.getHand().getCard(0));
//        System.out.println(super.getHand().getCard(1));
        System.out.println("The second card is secret. \n");
    }    
}
