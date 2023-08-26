/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Difference {
       public static void main(String[] args){
           Scanner input = new Scanner (System.in);
           long x = input.nextLong();
           int  y = input.nextInt();
           long z = input.nextLong();
           int  v = input.nextInt();
           //(A * B) - (C * D).
           System.out.printf("Difference = %d",(x*y)-(z*v));
       }
}
