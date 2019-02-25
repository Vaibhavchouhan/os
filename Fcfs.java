/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fcfs;
import java.util.*;


/**
 *
 * @author vaibhav
 */
public class Fcfs {

  
    
        
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        //System.out.println("enter number of process");
        //int n=sc.nextInt();
        int[] pid={1,2,3,4};
        int[] ar={0,2,1,6};
        int[] bt={5,1,2,1};
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
        
        
        }
         for (int i = 0; i < ar.length; i++) 
        {
            tat[i]=ct[i]-ar[i];
        }
        for (int i = 0; i < ar.length; i++)
        {
            wt[i]=tat[i]-bt[i];
        }
        System.out.println("PRO   AT    BT    CT    TAT    WT");
        for (int i = 0; i < ar.length; i++)
        {
            System.out.print(pid[i]+"     ");
            System.out.print(ar[i]+"     ");
            System.out.print(bt[i]+"     ");
           
            System.out.print(ct[i]+"     ");
            System.out.print(tat[i]+"       ");
            System.out.println(wt[i]+"      ");
        }
        
            
    }
    }
    
