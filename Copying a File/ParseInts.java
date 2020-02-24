package appl.pkg1.no.pkg2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishindo
 */
public class ParseInts {
    public static void main(String[] args)
    {
        int val, sum=0;
        Scanner scan = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());
        while (scanLine.hasNext())
        {
            try{
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
            catch(NumberFormatException ex){
            }
            
        }
        System.out.println("The sum of the integers on this line is " + sum);
    }
}
