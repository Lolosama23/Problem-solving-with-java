


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class TwoNumbers {
                   public static void main(String[] args){
           Scanner input = new Scanner (System.in);
           double x = input.nextInt();
           double y = input.nextInt();
           /*floor 10 / 6 = 1
                ceil 10 / 6 = 2
                round 10 / 6 = 2*/
           
                         System.out.println("floor "+(x)+" / "+(y)+" = "+(int)Math.floor(x/y));
                       System.out.println("ceil "+(x)+" / "+(y)+" = "+(int)Math.ceil(x/y));
                         System.out.println("round "+(x)+" / "+(y)+" = "+(int)Math.round(x/y));
           
                   }
}
