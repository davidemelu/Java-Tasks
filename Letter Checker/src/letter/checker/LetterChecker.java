 bgv  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letter.checker;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class LetterChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter Letter");
        Scanner view=new Scanner(System.in);
        char letter=view.next().charAt(0); 
        if(letter=='a'||letter=='e'|| letter=='i'|| letter=='o'||letter=='o'){
            System.out.println(letter+ " is a vowel");
        }
        else{
            System.out.println(letter+ " is a consonant");
        }
    }
    
}
