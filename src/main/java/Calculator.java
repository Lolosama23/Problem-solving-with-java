


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Calculator {
      public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          //           int x = input.nextInt();
//           char z = input.next().charAt(0);
//             int y = input.nextInt();
//             if (z=='+')
//                                         System.out.println(x+y);
//             else if (z=='-')
//                                         System.out.println(x-y);
//             else if (z=='*')
//                                         System.out.println(x*y);
//             else if (z=='/')
//                                         System.out.println(x/y);
//                 
//      }                        
//}
//


          String x = input.next();
          char ch = ' ';
          int mid =0;
          for(int i = 0;i<x.length();i++)
          {
              if(x.charAt(i)=='+'||x.charAt(i)=='-'||x.charAt(i)=='*'||x.charAt(i)=='/')
              {
                  ch=x.charAt(i);
              mid=i;
              break;
              }
          }
          switch (ch)
          {
              case '+':
                  System.out.println(Integer.parseInt(x.substring(0,mid))+Integer.parseInt(x.substring(mid+1)));
                  break;
                   case '-':
                  System.out.println(Integer.parseInt(x.substring(0,mid))-Integer.parseInt(x.substring(mid+1)));
                  break;
                   case '*':
                  System.out.println(Integer.parseInt(x.substring(0,mid))*Integer.parseInt(x.substring(mid+1)));
                  break;
                   case '/':
                  System.out.println(Integer.parseInt(x.substring(0,mid))/Integer.parseInt(x.substring(mid+1)));
                  break;
                 
          }
      }

}
