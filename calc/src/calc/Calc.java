/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1;
        int n2;
        String Operation = null;
        Scanner view=new Scanner(System.in);
        System.out.println("Enter first number");
        n1=view.nextInt();
        System.out.println("Enter second number"); 
        n2=view.nextInt();
        System.out.println("Enter sign");
        Operation=view.next();
        if("+".equals(Operation)){
            System.out.println("answer"+ (n1+n2));
        }
        if("*".equals(Operation)){
            System.out.println("answer"+ (n1*n2));
        }
        if("-".equals(Operation)){
            System.out.println("answer"+ (n1-n2));
        }
        if("/".equals(Operation)){
            System.out.println("answer"+ (n1/n2));
        }
        // TODO code application logic here
    }
    
}
