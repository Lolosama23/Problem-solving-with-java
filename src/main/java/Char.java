


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Char {
                             public static void main(String[] args){
           Scanner input = new Scanner (System.in);
           char x = input.next().charAt(0);
           if(x>=65&&x<=90)
               
                                     System.out.println(x+=32);
           else
                                     System.out.println(x-=32);
                             }

}
