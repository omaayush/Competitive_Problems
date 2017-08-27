
import java.util.Scanner;



/*
 * My code is awesome.
 * suggestions to the code will be highly appreciable
 * Contact me for any query @ omaayushvarshney@gmail.com
 */

/**
 *
 * @author om
 */
//LIFE,UNIVERSE & EVERYTHING

class ELEVSTRS {
    public static void main(String args[]) throws java.lang.Exception
    {
        //java.io.BufferedReader r=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        //int n=Integer.parseInt(r.readLine());
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            float N=sc.nextFloat();
            float v1=sc.nextFloat();
            float v2=sc.nextFloat();
            if(((Math.sqrt(2)*N)/v1)<((2*N)/v2))
            System.out.println("Stairs");
            else
                System.out.println("Elevator");
            
            
        }
        
    }
    
}