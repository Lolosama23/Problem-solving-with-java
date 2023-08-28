
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */

import java.util.Scanner;
public class SortNumbers {
                      public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          long x = input.nextLong();
           long y = input.nextLong();
            long z = input.nextLong();
            if(x<=y&&x<=z)
            {
                    if(y<=z)
                           System.out.println((x)+"\n"+(y)+"\n"+(z));
                    else
                           System.out.println((x)+"\n"+(z)+"\n"+(y));
            }
     
            
             else if (y<=x&&y<=z)
             {
                            if (x<=z)
                                System.out.println((y)+"\n"+(x)+"\n"+(z));
                            else
                                System.out.println((y)+"\n"+(z)+"\n"+(x));
                     
             }
             else if (z<=x&&z<=y)
             {
                                if (x<=y)
                                    System.out.println((z)+"\n"+(x)+"\n"+(y));
                                else
                                    System.out.println((z)+"\n"+(y)+"\n"+(x));
             }  
            
                 System.out.println("\n"+(x)+"\n"+(y)+"\n"+(z));
      }
    
}
