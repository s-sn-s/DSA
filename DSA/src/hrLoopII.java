import java.util.*;
import java.io.*;

class hrLoopII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int[]s = results(a,b,n);
            for (int j : s) {
               System.out.print(j + " "); 
            }
            System.out.println();
        }
        in.close();
    }
    
    public static int[] results(int...i){
        int[] s= new int[i[2]];

        for(int tmp =0; tmp<i[2];tmp++)
        {
            if (tmp==0){
                s[tmp] = (int) (i[0]+((Math.pow(2, tmp))*i[1]));
            }
            else{
                s[tmp] = (int) (s[tmp-1]+((Math.pow(2, tmp))*i[1]));
            }
        }
        //System.out.println();
        return(s);
    }
}