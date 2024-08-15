


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Twointervals {
          public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          long l1 = input.nextLong();
          long r1 = input.nextLong();
          long l2 = input.nextLong();
          long r2 = input.nextLong();
          if (Math.max(l1, l2)>Math.min(r1, r2))
              System.out.println("-1");
          else
              System.out.println(Math.max(l1, l2)+" "+Math.min(r1, r2));
      }
}
