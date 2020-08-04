/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple_mathfx;

import java.util.*;

/**
 *
 * @author Hp
 */
public class Multiple_mathfx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 0;
        do{
        double n1;
        String Operation ;
        Scanner view=new Scanner(System.in);
        System.out.println("Enter number/angle");
        n1 = view.nextDouble();
        System.out.println("Funtion(FX)");
        Operation=view.next();
        if("sin".equals(Operation)){
            System.out.println("sin: " + Math.sin(n1));   
        }
        if("cos".equals(Operation)){
            System.out.println("cos: " + Math.cos(n1));   
        }
        if("tan".equals(Operation)){
            System.out.println("tan: " + Math.tan(n1));   
        }
        if("log".equals(Operation)){
            System.out.println("log: " + Math.log(n1));   
        }
        if("squareroot".equals(Operation)){
            System.out.println("square_root: " + Math.sqrt(n1));   
        }
       } 
        while(i<=10);
    }
}
