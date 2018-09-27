package javaapplication5;

import java.util.Scanner;
public class JavaApplication5 {

    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        int minutes;
        int hours;
        int days;
        
        System.out.print("Hello. How many minutes do you have? ");
        minutes = myScanner.nextInt();
        
        days = minutes / 1440;
        hours = (minutes / 60) % 24;
        int remMinutes = minutes % 60;
        
        System.out.print("That is " + days + " days, " + hours + " hours, and " +
                remMinutes + " minutes.");
    }
    
}

