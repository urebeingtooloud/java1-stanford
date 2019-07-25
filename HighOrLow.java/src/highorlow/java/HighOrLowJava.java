/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highorlow.java;
import java.util.Scanner;
import java.util.Random;


/** 
 *
 * @author Education Unlimited
 */
public class HighOrLowJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random random = new Random();
       Scanner scanner = new Scanner(System.in);
       int number = random.nextInt(100);
       int guess =  -1;
       while (guess!=number) {
           System.out.print("guess a number 1-100 ");
           guess = scanner.nextInt();
           if (guess<number) {
               System.out.println("too low! try again!");
           } else if (guess>number) {
               System.out.println("too high! try again!");
           }else {
               System.out.println("correct! the number was " + number);
           }
           }
         
       }
    }
