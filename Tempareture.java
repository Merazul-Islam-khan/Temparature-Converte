/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temparatureconverter;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Tempareture {
    static Scanner user_input=new Scanner(System.in); 
    public static boolean exitProgram=false;
    
    public static void main(String []args){
        
        double m,n;
        System.out.println("Temperature Conversion");
        System.out.println("..............\n");
        
        while(!exitProgram){
            
            System.out.println("Enter your Choice :\n1.Celsius to Fehrenheit\n2.Celsius to Kelvin\n3."
                    + "Fahrenheit to Celsius\n4.Fahrenheit to Kelvin\n5.Kelvin to Celsius \n6.Kelvin to"
                    + "Fahrenheit\n7.Exit\n");
            
            
            
            String c =user_input.next();
            
            try{
                
                switch(c){
                    
                    case "1":
                        System.out.println("Enter your Celsius number:");
                        n=user_input.nextDouble();
                        m=((9.0/5.0)*n)+32;
                        System.out.println(n+" Celsius=" + m + "Fahreheit\n");
                        break;
                        
                    case "2":
                        System.out.println("Enter your Celsius number:");
                        n=user_input.nextDouble();
                        m=n+273.5;
                        System.out.println(n+" Celsius=" + m + "Kelvin\n");
                        break;
                        
                    case "3":
                        System.out.println("Enter your Fahreheit number:");
                        n=user_input.nextDouble();
                        m=(n-32)*5/9;
                        System.out.println(n+" Fahreheit=" + m + "Celsius\n");
                        break;
                    case "4":
                        System.out.println("Enter your Faherheit number:");
                        n=user_input.nextDouble();
                        m=((5.00/9.00)*(n-32))+273.15;
                        System.out.println(n+" Faherheit=" + m + "Kelvin\n");
                        break;
                    case "5":
                        System.out.println("Enter your Kelvin number:");
                        n=user_input.nextDouble();
                        m=n-273.15;
                        System.out.println(n+" Kelvin=" + m + "Celsius\n");
                        break;
                    case "6":
                        System.out.println("Enter your Kelvin number:");
                        n=user_input.nextDouble();
                        m=((n-273.15)*(9.0/5.0))+32;
                        System.out.println(n+" Kelvin=" + m + "Fahreheit\n");
                        break;
                    case "7":
                        exitProgram=true;
                        System.out.println("Program is terminated\n");
                        break;
                    default:
                        System.out.println("Please provide proper input\n");
                        continue;
                        
                }
                
            } catch (Exception e) {
           System.out.println(e);
        }
        }
    }
    
    
    
}
