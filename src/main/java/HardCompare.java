


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class HardCompare {
                  public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
            long a = input.nextLong();
          long b = input.nextLong();
          long c = input.nextLong();
          long d = input.nextLong();
          if ( b*Math.log(a)>d*Math.log(c))
              System.out.println("YES");
          else
              System.out.println("NO");
      }

    
}
