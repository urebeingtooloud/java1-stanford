/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopjava;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class ForLoopJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Scanner keyboard = new Scanner(System.in);
        System.out.println("starting number: ");
        int a = keyboard.nextInt();
        System.out.println("ending number: ");
        int b = keyboard.nextInt();
        System.out.println("a number to count by: ");
        int c = keyboard.nextInt();
        for(int i = a; i < b; i = i + c) {
            System.out.println(i);
            
          
        
        
            
        }
    
    }
    
}
