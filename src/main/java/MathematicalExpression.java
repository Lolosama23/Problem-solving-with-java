


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class MathematicalExpression {
                                  public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          int a = input.nextInt();
          char x = input.next().charAt(0);
          int b = input.nextInt();
          char y = input.next().charAt(0);
          int c = input.nextInt();
          if ( a+b==c)
          
              System.out.println("Yes");
          else if (a-b==c)
              System.out.println("Yes");
          else if (a*b==c)
              System.out.println("Yes");
          else
          {
              if(x=='+')
                   System.out.println(a+b);
              else if (x=='-')
                   System.out.println(a-b);
              else
                  System.out.println(a*b);
          }
      }

}
