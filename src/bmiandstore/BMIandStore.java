/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bmiandstore;
import java.util.Scanner;

/**
 *
 * @author bham2
 */
public class BMIandStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean RUN=true;
        String RUN2="Nothing";
        while(RUN==true)
        {
    Scanner reader= new Scanner(System.in);//Reading from the System in 
        System.out.println("What is the person height in Meters");
    double height=reader.nextDouble();
    System.out.println("what is the person weight in kg(1 kg=2.2kg)?");
    double weight=reader.nextDouble();
    System.out.println("BMI="+weight/(height*height));
    System.out.println("Whould you like to run Agian? True or False");
    RUN2=reader.next();
    
    if (RUN2.equals("True") || RUN2.equals("true"))
    {
        RUN=true;
    }
    else if (RUN2.equals("False") || RUN2.equals("false"))
    {
        RUN=false;
    }
        }
        // TODO code application logic here
    }
    
}