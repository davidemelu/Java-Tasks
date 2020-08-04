/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Login {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        for(a=1;a<=10;){
        System.out.println("Login Info");
        Scanner scan=new Scanner(System.in);
        System.out.println("Name");
        String nam=scan.next();
        System.out.println("Sex");
        String sex=scan.next();
        System.out.println("Age");
        int ag=scan.nextInt();
        System.out.println("Set");
        String cla=scan.next();
        System.out.println("--------------------");
        System.out.println("Details");
        System.out.println("Name: "+ nam);
        System.out.println("Ses: "+ sex);
        System.out.println("Age: "+ ag);
        System.out.println("Class: "+ cla);
        System.out.println("--------------------");
        }
        // TODO code application logic here
    }
    
}
