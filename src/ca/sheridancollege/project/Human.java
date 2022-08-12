/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author moosundammy 
 *         thithanhvanpham
 */
public class Human extends Player {
    
    //Scanner object
    Scanner input = new Scanner(System.in);
    
    //Create a new Player
    public Human() {
        super.setName("Player");
    }
    
//Ask the player if draw os stand the hand    
public boolean choice(){
    
    //Variables
    int choice;
    boolean answer = true, check = true;

    //While statement to check the player answer
    while(check){
        try{
            //Asking the user
            System.out.println("What would you like to do? \n Type 1 fo Draw \n Type 2 for Stand");
            choice = input.nextInt();
            
            //Checking the answer
            switch (choice) {
                case 1:
                    answer = true;
                    check = false;
                    break;
                case 2:
                    answer = false;
                    check = false;
                    break;
                default:
                    System.out.println("Wrong choice, try again.");
                    break;
            }
            
        }catch(InputMismatchException e){
            System.out.println("Wrong choice, try again.");
            input.nextInt();
        }   
    }
    return answer;
}
   
    

}
