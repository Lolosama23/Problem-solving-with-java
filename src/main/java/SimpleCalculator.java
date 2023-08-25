/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class SimpleCalculator {
     public static void main(String[] args){
         Scanner input = new Scanner (System.in);
         int x = input.nextInt();
         int y = input.nextInt();
        System.out.printf((x )+" + " +(y)+ " = %d%n",x+y);
        System.out.printf((x )+" * " +(y)+ " = %d%n",x*y);
         System.out.printf((x )+" - " +(y)+ " = %d%n",x-y);
     }
}
