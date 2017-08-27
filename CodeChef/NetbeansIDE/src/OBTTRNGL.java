
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

class OBTTRNGL {
    public static void main(String args[]) throws java.lang.Exception
    {
        //java.io.BufferedReader r=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        //int n=Integer.parseInt(r.readLine());
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int k=sc.nextInt();
            int A=sc.nextInt();
            int B=sc.nextInt();
            int c=Math.abs(B-A);
            if(c!=1 && k-c!=1)
            {
                if(k%2==0)
            {if(c==k/2)
                System.out.println("0");
            else
            {c--;
                int a=c<Math.abs(k-(c+2))?c:Math.abs(k-(c+2));
                        System.out.println(a);
            }
            }
            else
            {c--;
            if(c>0 && (Math.abs(k-(c+2)))>0)
                    {int a=c<Math.abs(k-(c+2))?c:Math.abs(k-(c+2));
                        System.out.println(a);
                    }
            else
            {
                if(c>0)System.out.println(c);
                else System.out.println(Math.abs(k-(c+2)));
            }
            }
        }
            else
               System.out.println("0"); 
        }
        
    }
    
}