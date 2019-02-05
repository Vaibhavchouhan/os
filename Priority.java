
package priority;
import java.util.*;

public class Priority {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
      
        int[] pid={1,2,3,4};
        int[] ar={1,0,2,3};
        int[] bt={2,4,3,2};
        int[] pr={1,2,1,3};
        int ct[]=new int[4];
        int tat[]=new int[4];
        int wt[]=new int[4];
       int temp=0;
       for(int i=0;i<=3;i++)
       {
           for(int j=i+1;j<4;j++)
           {
           if(ar[i]>ar[j])
           {
                temp = ar[i];
	        ar[i] = ar[j];
	        ar[j] = temp;
                
                temp = pr[i];
	        pr[i] = pr[j];
	        pr[j] = temp;
                
	        temp = bt[i];
		bt[i] = bt[j];
		bt[j] = temp;
                
		temp = pid[i];
		pid[i] = pid[j];
		pid[j] = temp;
           }
           }
       }
          
   
      

       for(int j=0;j<ar.length;j++)
       {
           System.out.println(pr[j]);
       
       }
         for(int i=0;i<ar.length-1;i++)
           if(ar[i]==ar[i+1]&& pr[i]>pr[i+1])
           {
               temp=pr[i];
               pr[i]=pr[i+1];
               pr[i]=pr[i+1];
               pr[i+1]=temp;
           
       
    }
          for(int i=0;i<ar.length;i++)
        {
            if(i==0)
            {
                ct[0]=ar[0]+bt[0];
            }
            else
            {
                ct[i]=ct[i-1]+bt[i];
            }
        }
       
         for(int i=0;i<ar.length;i++)
        {
            tat[i]=ct[i]-ar[i];
        }
      for(int i=0;i<ar.length;i++)
        {
            wt[i]=tat[i]-bt[i];
        }
       int sumtat=0,sumwt=0;
        for(int i=0;i<ar.length;i++)
        {
            sumtat+=tat[i];
            sumwt+=wt[i];
        }
        
       float avg_tat=sumtat/ar.length;
        float avg_wt=sumwt/ar.length;
        
               System.out.println("Average WT :"+avg_wt);
        System.out.println("Average TAT :"+avg_tat); 
       for(int i=0;i<ar.length;i++)
        {
            System.out.println("at is "+ar[i]);
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.println("bt is "+bt[i]);
        }
         for(int i=0;i<ar.length;i++)
        {
            System.out.println("ct is "+ct[i]);
        }
    }
}   
        
    
    
          