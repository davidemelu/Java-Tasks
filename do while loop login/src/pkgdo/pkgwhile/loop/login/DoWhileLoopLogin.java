/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgdo.pkgwhile.loop.login;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class DoWhileLoopLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i=0;
        do{
        System.out.println("Login Info");
        Scanner scan=new Scanner(System.in);
        System.out.println("Name");
        String nam=scan.next();
        System.out.println("Sex");
        String se=scan.next();
        System.out.println("Age");
        int ag=scan.nextInt();
        System.out.println("Set");
        String cla=scan.next();
        }
        while(i<=10);
        // TODO code application logic here/
    }
    
}
