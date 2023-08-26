
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class AreaofCircle {
           public static void main(String[] args){
           Scanner input = new Scanner (System.in);
           float r   = input.nextFloat();
           double pi = 3.141592653;
           double area = pi*r*r;
               System.out.println(String.format("%.9f", area));
           }
}
