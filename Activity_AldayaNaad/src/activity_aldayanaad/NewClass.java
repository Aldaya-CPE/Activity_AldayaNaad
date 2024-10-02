/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity_aldayanaad;


import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author Clarisse Angeline
 */
public class NewClass {
     public static void main(String[] args) throws Exception {
     Scanner scanner  = new Scanner(System.in);
     
       int [] numbers = {2,4,6,8,10};
       double mean = calculateMean(numbers);
       
       System.out.println("Mean: " + mean);
     }
              
     public static double calculateMean(int[]numbers){
           int sum = 0;
           for (int num: numbers ){
               sum+=num;
           }
           return (double) sum/numbers.length;
}
}
       
       
 
        
           
       


