/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_aldayanaad;

import java.util.Scanner;
import activity_aldayanaad.Activity_AldayaNaad;

/**
 *
 * @author Vea
 */
public class Activity_AldayaNaad {

     int sum, quotient, product, difference;
     
     int a, b,c;
    public static void main(String[] args) {
        System.out.println("Hello World");
        Activity_AldayaNaad calculator = new Activity_AldayaNaad();
        calculator.calculate();
        
        NewClass cal = new NewClass();
        cal.meean();
        
        Name name = new Name();
        name.list();
    }
    
    public void calculate(){
       Scanner scanner = new Scanner(System.in);
        
       System.out.print("Enter the first number: ");
        a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        c = scanner.nextInt();
        sum = a + b + c;
        difference = a - b-c;
        product = a * b*c;
        
        if (b != 0) {
            quotient = a / b/c;
        } else {
            quotient = 0;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
    }

    

