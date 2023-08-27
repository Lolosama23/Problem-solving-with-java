


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class alphapetDidits {
                         public static void main(String[] args){
           Scanner input = new Scanner (System.in);
           char x = input.next().charAt(0);
           //int x=input.nextInt();
           if((int)x>='0'&&x<='9')
               //if(x>=48&&x<=57)
                                 System.out.println("IS DIGIT");
           else if (x>='a'&&x<='z')
               //if(x>=97&&x<=122)
           {
                                 System.out.println("ALPHA");
                                 System.out.println("IS SMALL");
           }
                     else 
           {
                                 System.out.println("ALPHA");
                                 System.out.println("IS CAPITAL");
           }                     
                         }

}
