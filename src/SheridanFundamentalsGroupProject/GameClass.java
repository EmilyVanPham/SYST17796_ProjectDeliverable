/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SheridanFundamentalsGroupProject;

import java.util.Scanner;

/**
 *
 * @author moosundammy
 */
public class GameClass {
    
    //Atributes and variables for game class
    private DeckClass deck;
    private DealerClass dealer;
    private HumanClass human;
    
    private double money;
    private double bet;
       
    //contructor
    public GameClass(){
        
        //Scanner object
        Scanner input = new Scanner(System.in);        
   
        //Create the Objects constructor
        dealer = new DealerClass();
        human = new HumanClass();
        deck = new DeckClass();
                  
        //initializing variables
        money = 150.0;
        bet = 0;
        
        //Meeting the player
        System.out.println("Welcome to the classic Black Jack Game! \nWhat is your name?");
        human.setName(input.nextLine());
        System.out.println("Nice to meet you " + human.getName());
        
        //Start the first round
        startGame();
    }
        
    //Main game method
    private void startGame(){
              
        //Scanner object
        Scanner input = new Scanner(System.in);
        
        //While loop to run until player lost the whole money 
        while(money>0){
            
            //Cleanning deck and hands
            deck.clearDeck();
            dealer.getHand().clearHand();
            human.getHand().clearHand();
            
            //Create and shuflle new deck 
            deck.createDeck();
            deck.shuffleDeck();
        
            //Asking for a bet
            while(true){
                try{
                    System.out.println("You have $" + money + "\nHow much do you wanna bet?");
                    bet = input.nextDouble();
                    break;
                }catch(Exception e){
                    System.out.println("Wrong input, please try again!");
                    input.next();
                }
            }        
        
            //checking the bet
            while(bet>money){
                System.out.println("So sorry! Your balance is not enough :( Account balance is: " + money);
                System.out.println("How much do you want to bet?");
                bet = input.nextDouble();
            }
            
            //display the bet
            System.out.println("Your bet was $" + bet + "\n");
        
            //Dealer draw 2
          
            dealer.getHand().drawDeck(deck);
            dealer.getHand().drawDeck(deck);

            //Player Draw 2
          
            human.getHand().drawDeck(deck);
            human.getHand().drawDeck(deck);
        
            //Display the hands
            dealer.dealerHand();
            human.displayHand();    
    
            //Check about blackJack
            boolean dealerBJ = dealer.blackJackGG();
            boolean humanBJ = human.blackJackGG();
    
            //Check if dealer has BlackJack
            if(dealerBJ){
        
                //Check if the player has BlackJack together the dealer
                if(humanBJ){
                    System.out.println("You both have 21, Tie");
                    startGame();
                    
                }else{
                    System.out.println("Dealer has BlackJack. You lost.");
                    
                    //Reduce the money according to bet
                    money -= bet;
                    
                    //Display the dealer hand
                    dealer.displayHand();
                    
                    startGame();
                }
            }

            //Check if player player has blackjack
            if(humanBJ){
                System.out.println("Blackjack! You won!");
                
                //Increase the money according to bet
                money += bet;
                
                startGame();
            }
        
            //Ask player if want to stand or draw a card
            while(human.choice()){
                human.getHand().drawDeck(deck);
                human.displayHand(); 
            }
            
            //checking if the dealer has less than 16 value in its hand
            while(dealer.getHand().getValueHand()<16){
                System.out.println("Dealer card is less than 16, so he will draw a card");
                        System.out.println("Dealer hand is:");
                    System.out.println(dealer.getHand().getCard(0));
                    System.out.println(dealer.getHand().getCard(1));
//        System.out.println(super.getHand().getCard(1));   
                
                dealer.getHand().drawDeck(deck);
               
            }           
                    
            //Check if the player value is more than 21
            if(human.getHand().getValueHand()> 21){
                System.out.println("You have more than 21. You lost :(");
                money -= bet;
                startGame();
            }
            
            //Check who wins
            if(dealer.getHand().getValueHand()>21){
                System.out.println("Dealer lost, you won :)");
                money += bet;
            
            }else if(dealer.getHand().getValueHand() > human.getHand().getValueHand()){
                System.out.println("You lost. :(");
                money -= bet;
            
            }else if(human.getHand().getValueHand() > dealer.getHand().getValueHand()){
                System.out.println("You won. :)");
                money += bet;
            
            }else{
                System.out.println("Push!!!");
            }
 
            //Start a new round
            startGame();         
                        
        }
         
        //Kind message to exit
        System.out.println("Sorry you lost the whole money, see you");
        System.exit(0);
    }
}
