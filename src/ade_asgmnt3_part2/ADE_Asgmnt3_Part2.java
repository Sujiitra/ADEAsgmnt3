
package ade_asgmnt3_part2;

import java.util.Scanner;

public class ADE_Asgmnt3_Part2 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String pressed1;
        pressed1= scan.next();
        activate(pressed1);
        
    }
    
    public static void activate(String pressed1){
        if(pressed1.equals("button1-5secs")){
            System.out.println("Button 1 pressed for 5seconds has activated the colour camera");
            action();
        }
        else if(pressed1.equals("button1-10secs")){
            System.out.println("Button 1 pressed for 10seconds has activated 16mm camera");
            action();
        }
        else if(pressed1.equals("button1-Twice")){
            System.out.println("Button 1 pressed twice has activated drill");
            drill();
        }
    }
        
    public static void action(){
        Scanner scan = new Scanner(System.in);
        String pressed2=scan.next();
        if(pressed2.equals("button1")){
            System.out.println("Button 1 takes picture.");
            String pressed3=scan.next();
            if(pressed3.equals("button2"))
            System.out.println("Button 2 brings the rover to the idle state."); 
        }
        else if(pressed2.equals("button1-5secs")){
            System.out.println("Button 1 pressed for 5seconds turns on temporizer.");
            String pressed3=scan.next();
            if(pressed3.equals("button2"))
            System.out.println("Button 2 brings the rover to the idle state."); 
        }
        else if(pressed2.equals("button2"))
            System.out.println("Button 2 brings the rover to the idle state.");
        }
    
    
    public static void drill(){
       int i=1;
       Scanner scan = new Scanner(System.in);
       String pressed3=scan.nextLine(); 
       if(pressed3.equals("button1")){
            if(i%2==1){
                System.out.println("Drill is turned on");
                i++;
                }
            else{
                System.out.println("Drill is turned off");
                i++;
                }
            }
                
    else if(pressed3.equals("button2")){
    System.out.println("Button 2 brings the rover to the idle state.");
    }
    }
    
}
