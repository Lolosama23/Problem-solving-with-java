


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class multiplies {
             public static void main(String[] args){
           Scanner input = new Scanner (System.in);
           long x = input.nextLong();
           long y = input.nextLong();
           if(x%y==0||y%x==0)
           
               System.out.println("Multiples");
               else
               System.out.println("No Multiples");
           
             }

}
