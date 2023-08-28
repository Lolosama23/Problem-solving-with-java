


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Comparison {
                              public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          int x = input.nextInt();
          char z = input.next().charAt(0);
          int y = input.nextInt();
          if(x>y&&z=='>')
              System.out.println("Right");
          else if (y>x&&z=='<')
              System.out.println("Right");
          else if (x==y&&z=='=')
              System.out.println("Right");
          else
              System.out.println("Wrong");
              
          
      }

}
