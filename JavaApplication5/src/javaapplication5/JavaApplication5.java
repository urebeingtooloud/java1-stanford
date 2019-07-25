/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;
/**
 *
 * @author Education Unlimited
 */
public class JavaApplication5 {

     public static void main(String args[]) {
		int damageInit = 80;
    int fursInit = 0;
    int healthInit = 16;
    int partyInit = 4;
    int partyCurrent = 4;
    System.out.println ("Enter your name: ");
    Scanner keyboard = new Scanner(System.in);
    String userName = keyboard.nextLine();
    System.out.println("You are " + userName + ". You and your family of 4 have decided to travel along the Oregon trail in an effort to better your lives.");
    System.out.println("You buy a wagon, two oxen, and supplies. You gather your most important belongings and set off on your adventure.");
      
    // FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST FOREST 
      
    System.out.println("First, you enter a forest and find some deer and turkey. You start to hunt and halfway through your hunt, you are ambushed by bandits.");
    System.out.println("Do you \n 1) Run towards a cave. \n 2) Fight the bandits and also fight the boss for rewards.");
    int userInput = keyboard.nextInt();
      if(userInput == 1){
      caveI_II_I(userInput);
    }
      if(userInput == 2){  
      bossI_II_II(userInput);
    }
    
    }
    //----------------------------------------------------------
    public static void caveI_II_I(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option" + userInput);
      System.out.println("You enter the cave and walk for a bit. soon, you comne to a cavern that splits into two paths.");
      System.out.println("Do you \n 1) go left \n 2) go right");
      userInput = keyboard.nextInt();
      if(userInput == 1){
      batsI_II_IIleft();
      }
      if(userInput == 2){  
      gunsI_I_Iright();
      }
    
    }
  
  	public static void bossI_II_II(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option" + userInput);
   		System.out.println("You decide to fight the bandits head on.\nAfter being assaulted by waves of bandits, you are attacked by a machine-gun wagon.\nFighting through the gunfire you take down the wagon and aquire furs and medicines.");
      System.out.print("You now have " + healthInit);
    }
    //----------------------------------------------------------
  	public static void batsI_II_IIleft(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
        
    }
  
  	public static void gunsI_I_Iright(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
        
    }
  
  	public static void unicornsI_II_III(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
  	public static void unicornsI_II_IIIleft(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
      
  	public static void unicornsI_II_IIIright(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
		public static void searchForFoodI_III(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }  
  
  	public static void bearsI_III_I(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
  	public static void bearAttackI_III_II(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  	
  	public static void caveI_III_III(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
  	public static void riverII(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
  	public static void fordII_I(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
  	public static void jumpII_II(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
  	public static void pirateShipII_I_I(int userInput){
      Scanner keyboard = new Scanner(System.in);
      System.out.println("You have chosen option " + userInput);
      
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static void takeDamage(int healthInit){
      
      System.out.println(userName+" has been rekt, you have "+ healthInit +" left");
      
    }
  
  public static void gameOver(){
      
      System.out.println("Unfortunately, " + userName + ".exe has stopped working. You died.");
      
    }
}