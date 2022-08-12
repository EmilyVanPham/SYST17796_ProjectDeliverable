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
public abstract class Player {
    
    //Attributes of class
    private Hand hand;
    private String name;
    
    //New Player
    public Player(){
        this.hand = new Hand();
        this.name = "";
    }
    
    //check black jack
    public boolean blackJackGG(){
    
        if(this.getHand().getValueHand() == 21){
            return true;
        }else{
            return false;
        }
    }

    //Getters and Setters
    public Hand getHand() {return hand;}
    public void setHand(Hand hand) {this.hand = hand;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    //display the hand
    public void displayHand(){
        System.out.println(getName() + " hand is :");
        System.out.println(getHand() + " The hand Value is =  " + getHand().getValueHand() + "\n");
    }
    
}
