


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Thelast2digits {
              public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          long a = input.nextLong();
          a%=100;
          long b = input.nextLong();
          b%=100;
          long c = input.nextLong();
           c%=100;
          long d = input.nextLong();
           d%=100;
         long x = (a*b*c*d)%100;
         if ( x<10)
          System.out.println("0"+x);
         else
              System.out.println(x);
          
      }

    
}
