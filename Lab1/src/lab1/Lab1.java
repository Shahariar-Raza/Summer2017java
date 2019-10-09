/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Shaha
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello , World!");
        System.out.printf("I am %d yeasrs old.\n" , 24);
    
    /*
        Declear two integer variable x & y .
        Put the minimum of those in third variable z.
        print the value of z.
        
        */
     int x =10;
     int y =20;
     int z;
     if (x<y)
         z=x;
     else z=y;
    System.out.printf("Minimum value is %d\n ",z);
     
    /*
    Solve  the same problem with Math.min Method;
    */
      z = Math.min(x, y);
    System.out.printf("Minimum value is %d\n ",z);
    
    /*
    a) Expontiation
    b) Square Root
    Calculate and print the value of 2^10;
    and Square Root of 450
   */
    double Power = Math.pow(2, 10);
    double SquareRoot = Math.sqrt(450);
    System.out.printf("Power is %.0f\n", Power);
    System.out.printf("Suare Root is %f\n", SquareRoot);
    
    x = 2^10;
    // 2 = 0010 (Binary)
    //10 = 1010 (Binary)
    //.........................XOR
    // 8 = 1000
    System.out.printf("Power is = %d\n", x);
    // Find the Smallest element from an arry 
    int data[] = {5,9,5,2,3,6,7,0};
    int temp;
    for (int i = 0; i < data.length; i++)
               {  
            for (int j = i + 1; j < data.length; j++)   
            {  
                if (data[i] > data[j])   
                {  
                    temp = data[i];  
                    data[i] = data[j];  
                    data[j] = temp;  
                }  
                
            }  
            
        }  
      System.out.printf("Smallest id %d\n", data[0]);
    }
  
    }
