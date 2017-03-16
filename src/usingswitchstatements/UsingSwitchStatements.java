/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingswitchstatements;

/**
 *
 * @author JARVIS
 */
import java.util.*;
public class UsingSwitchStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char alphabets;
        Scanner sc = new Scanner(System.in);
        
        System.out.println  ("Enter your alphabet:");
      
        alphabets = sc.next().charAt(0);
        
        switch(alphabets)
        {
            case 'A' :
            case 'a' :
                System.out.println("The Alphabet is A. Valid Character");
            break;
            
            case 'B' :
            case 'b' :
                System.out.println("The Alphabet is B. Valid Character");
            break;
            
            case 'C' :
            case 'c' :
                System.out.println("The Alphabet is C. Valid Character");
            break;
            
            case 'D' :
            case 'd' :
                System.out.println("The Alphabet is D. Valid Character");
            break;
            
            case 'E' :
            case 'e' :
                System.out.println("The Alphabet is E. Valid Character");
            break;
            
            default: 
                System.out.println("Not Found.");
            break;
        }
    }
    
}
