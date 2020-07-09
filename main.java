/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionoflist.inheritans;

import com.sun.xml.internal.stream.Entity;
import java.util.Scanner;

/**
 *
 * @author Shiplu L
 */
public class main {
    public static void main(String[] args) {
        son obj=new son();
        Scanner ouTput=new Scanner(System.in);
      
        
        System.out.println("How many car your father have : ");
       int inpUt=ouTput.nextInt();
        obj.setCar (inpUt);
        System.out.println("How many bick you have : ");
         int inpUt2=ouTput.nextInt();
        obj.setBick(inpUt2);
        System.out.println("How many land your father have : ");
        double inpUt1=ouTput.nextDouble();
        obj.setLand(inpUt1);
    }
}
