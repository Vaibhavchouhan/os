
public class Prioritynon {

    public static void main(String[] args) {

        int[] P = {1,2,3,4,5,6,7};

        int[] At = {0,2,1,4,6,5,7};

        int[] Bt = {3,5,4,2,9,4,10};

        int[] Pt = {2,6,3,5,7,4,10};

        int[] Ct = {0,0,0,0,0,0,0};

        int[] Tat = new int[7];

        int[] Wt = new int[7];

        float AvgWt=0, AvgTat=0;

        int count = 0,CuT=0;
        while(true){
        if(count == At.length){
            break;
        }
        int min =99 , index=At.length;
        for(int i =0;i<At.length;i++){
            
            if(At[i]<=CuT && Ct[i]==0 && Pt[i]<min){
                min = Pt[i];
                index = i;
            }
        }
        if(index==At.length){
            CuT++;
        }else{
            CuT = CuT + Bt[index];
            count++;
            Ct[index] = CuT;
        }
        
        }
        
        
        
         for(int j=0;j<P.length;j++){

            Tat[j] = Ct[j] - At[j];

            Wt[j] = Tat[j] - Bt[j];

            AvgTat = AvgTat + Tat[j];

            AvgWt = AvgWt + Wt[j];

       }

        AvgTat = AvgTat/(P.length );

        AvgWt = AvgWt/(P.length );     

        System.out.println("P\tA\tB\tC\tT\tW\tPt");

      for(int j=0;j<At.length;j++){

            System.out.println(P[j]+"\t"+At[j]+"\t"+Bt[j]+"\t"+Ct[j]+"\t"+Tat[j]+"\t"+Wt[j]+"\t"+Pt[j]);

            

       }

        System.out.println();

       System.out.println("Average TAT \t"+AvgTat);

       System.out.println("Average WT \t"+AvgWt);

    }

    

}