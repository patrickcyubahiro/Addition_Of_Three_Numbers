/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerageza;

/**
 *
 * @author Patrick CYUBAHIRO
 */
 import java.util.Scanner;
public class Gerageza {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
       
		int num1,num2,num3,result;
		System.out.println("Enter any 3 integers ");
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();
		num2 = in.nextInt();
		num3 = in.nextInt();
		result=num1+num2+num3;
		System.out.println("The result after addition is "+result);
	}
}
   
    
