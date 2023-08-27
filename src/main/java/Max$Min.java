


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Max$Min {
                 public static void main(String[] args){
           Scanner input = new Scanner (System.in);
           long x = input.nextLong();
             long y = input.nextLong();
               long z = input.nextLong();
                    // System.out.print(Math.min(Math.min(x, y),z)+" ");
                    // System.out.println(Math.max(Math.max(x, y),z)+" ");
               if(x<=y&&x<=z)
                         System.out.print(x+" ");
               else if (y<=x&&y<=z)
                         System.out.print(y+" ");
               else 
                         System.out.print(z+" ");
               if(x>=y&&x>=z)
                         System.out.println(x);
               else if (y>=x&&y>=z)
                         System.out.println(y);
               else
                         System.out.println(z);
               
               
                 }
}
