


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class FirstDigit 
{
       public static void main(String[] args)
             {
                    Scanner input = new Scanner (System.in);
                    int x = input.nextInt();
                    if((x/1000)%2==0)
                    
                        System.out.println("EVEN");
                        else
                        System.out.println("ODD");
                        
                    
             }

    
}
