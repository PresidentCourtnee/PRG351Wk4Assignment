import java.io.*;
import java.util.*;
import java.util.Scanner;
/**
 * Write a description of class SquareGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class SquareGenerator  
{
   static void squareGenerator(int n)
   {
       int[][] magicSquare = new int[n][n];
      
       int column = n/2;
       int row = n-1;

       for (int num=1; num <= n*n; )
       {
           if (column==-1 && row==n)
           {
               row = n-2;
               column = 0;
           }
           else
           {
               if (row == n)
                   row = 0;
                  
               if (column < 0)
                   column=n-1;
           }
          
           if (magicSquare[column][row] != 0)
           {
               row -= 2;
               column++;
               continue;
           }
           else
               magicSquare[column][row] = num++;
              
           row++; column--;
       }

       int i,j;
       for(i=0; i<n; i++)
       {
           for(j=0; j<n; j++)
               System.out.print(magicSquare[n-j-1][i]+" ");
           System.out.println();
       }
   }
  
   public static void run()
   {
   System.out.print("Enter an odd Number: ");
   Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
       if(n%2==1){
       System.out.println("Magic Square of "+n+" X "+n +" is");
       squareGenerator(n);
       }
       else{
       System.out.println(n+" is not an odd number");
       }
   }
}

    
   