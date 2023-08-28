


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author loaio
 */
import java.util.Scanner;
public class Coordinates 
{
          public static void main(String[] args)
      {
          Scanner input = new Scanner (System.in);
          float x = input.nextFloat();
          float y = input.nextFloat();
          if(x==0&&y==0)
              System.out.println("Origem");
          else if (x>0&&y>0)
              System.out.println("Q1");
          else if (x<0&&y>0)
              System.out.println("Q2");
          else if (x<0&&y<0)
              System.out.println("Q3");
          else if (x>0&&y<0)
              System.out.println("Q4");
          else if(x==0&&y>0||y<0)
              System.out.println("Eixo Y");
          else if(y==0&&x>0||x<0)
              System.out.println("Eixo X");


      }
}
