
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



/*
 * My code is awesome.
 * suggestions to the code will be highly appreciable
 * Contact me for any query @ omaayushvarshney@gmail.com
 */

/**
 *
 * @author om
 */
//

class lt {
    public static void main(String args[]) throws java.lang.Exception
    {
        //java.io.BufferedReader r=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        Scanner sc= new Scanner(System.in);
        //int n=Integer.parseInt(r.readLine());
        int n=sc.nextInt();
        for(int j=0;j<n;j++)
        {
            int v[]=new int[26];
            for(int k=0;k<26;k++)
            {v[k]=sc.nextInt();
            }
            int s=0;
            //for(int k=0;k<26;k++)
            //{
            //    s=s+v[k];
            //    System.out.print(v[k]);
            //}
            //System.out.println(s);
        ArrayList<String>alphabet = new ArrayList<String>(Arrays.asList("abcdefghijklmnopqrstuvwxyz".split("")));
        alphabet.remove(0);
        String sentence = sc.next().toLowerCase();
        for(int i=0;i<sentence.length();i++){
            if(!alphabet.isEmpty()){
                alphabet.remove(""+sentence.charAt(i));
            }else{
                break;
            }
        }
        if(alphabet.isEmpty())
        System.out.println("0");
        else
        {int sum=0;
            for(int m=0;m<alphabet.size();m++)
            {//System.out.println(sum);
            if(alphabet.removeAll(Collections.singleton("a")))
            {
                
                sum=sum+v[0];
            }
                switch(alphabet.get(m).charAt(0))
                {
                    case 'b':sum=sum+v[1];break;
                    case 'c':sum=sum+v[2];break;
                    case 'd':sum=sum+v[3];break;
                    case 'e':sum=sum+v[4];break;
                    case 'f':sum=sum+v[5];break;
                    case 'g':sum=sum+v[6];break;
                    case 'h':sum=sum+v[7];break;
                    case 'i':sum=sum+v[8];break;
                    case 'j':sum=sum+v[9];break;
                    case 'k':sum=sum+v[10];break;
                    case 'l':sum=sum+v[11];break;
                    case 'm':sum=sum+v[12];break;
                    case 'n':sum=sum+v[13];break;
                    case 'o':sum=sum+v[14];break;
                    case 'p':sum=sum+v[15];break;
                    case 'q':sum=sum+v[16];break;
                    case 'r':sum=sum+v[17];break;
                    case 's':sum=sum+v[18];break;
                    case 't':sum=sum+v[19];break;
                    case 'u':sum=sum+v[20];break;
                    case 'v':sum=sum+v[21];break;
                    case 'w':sum=sum+v[22];break;
                    case 'x':sum=sum+v[23];break;
                    case 'y':sum=sum+v[24];break;
                    case 'z':sum=sum+v[25];break;
            }
        }
            System.out.println(sum+1);
            
        
    }
    }
    
}
}
