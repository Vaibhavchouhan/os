import java.util.*;
public class Fcfs {

    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter number of process");
        //int n=sc.nextInt();
        int[] pid={1,2,3,4};
        int[] ar={0,1,0,2};
        int[] bt={2,3,4,2};
        int ct[]=new int[4];
        int tat[]=new int[4];
        int wt[]=new int[4];
       int temp=0;
       for(int i=0;i<=3;i++)
       {
           for(int j=0;j<=3-(i+1);j++)
           {
           if(ar[j]>ar[j+1])
           {
                temp = ar[j];
	        ar[j] = ar[j+1];
	        ar[j+1] = temp;
	        temp = bt[j];
		bt[j] = bt[j+1];
		bt[j+1] = temp;
		temp = pid[j];
		pid[j] = pid[j+1];
		pid[j+1] = temp;
           }
           }
               
       }
        
        //finding completion time
        for( int i=0;i<=3;i++)
        {
            if(i==0)
            {
           if(ar[i]==0)
               ct[i]=bt[i];
           else
               ct[i]=bt[i]+ar[i];
        }
        else
            ct[i]=bt[i]+ct[i-1];
        System.out.println(ct[i]);
        
        }
        
            
    }
    
}