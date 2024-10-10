/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity_aldayanaad;

import java.util.Scanner;

/**
 *
 * @author Vea
 */
public class Name {
    public static void list(){
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Enter name:");
        String name =scn.nextLine();
        System.out.println("Enter age:");
        int age =scn.nextInt();
        System.out.println("Enter Level:");
        int level =scn.nextInt();
         scn.nextLine();
        System.out.println("Enter Program:");
        String prog =scn.nextLine();


        System.out.println("I'am"+name+" "+age+" year's old"+" "+level+"year"+" "+"studying"+prog);


    }
    
}
