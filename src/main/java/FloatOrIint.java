


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class FloatOrIint {
                          public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          float x = input.nextFloat();
          int y = (int)x;
          if(x-y>0)
              System.out.println("float "+ y +" "+ (x - y));
          else
              System.out.println("int " + y);
      }

}
