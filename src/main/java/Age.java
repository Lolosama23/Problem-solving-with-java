


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Age
{
              public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          long x = input.nextLong();
          
          System.out.println(x/365+" "+"years");
          x%=365;
          System.out.println(x/30+" "+"months");
          x%=30;
          System.out.println(x+" "+"days");
          
      }
    
}
