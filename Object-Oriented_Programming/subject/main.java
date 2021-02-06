package subject;
import java.util.*;
public class main {

        public static void main(String[] args) 
        {
            Scanner scn = new Scanner(System.in);
         //   int n = scn.nextInt();
         System.out.println("sub");
            int sub = scn.nextInt();
           
            String[] array1 = new String[sub]; 
            String [] array2 = new String [sub];
            int[] array3 = new int[sub]; 
            for (int s = 0; s < sub;) {
                        int i =0;
                        int j =0;
                        int m =0;
                        for (;i < sub &&j<sub&&m<sub;) {
                            System.out.println("i");
                            System.out.println("j");
                            System.out.println("m");
                            
                            array1[i]=scn.nextLine();
                            array2[j]= scn.nextLine();
                            array3[m] = scn.nextInt();
                            System.out.println("All"+i+""+j+""+m);
                        }
                        i++;
                        j++;
                        m++;
                        s++;
        }
       


            // sRecords subs[]=new sRecords[3];
            // subs[0]=new sRecords("s101","DS",100);
            // subs[1]=new sRecords("s102","Algorithms",100);
            // subs[2]=new sRecords("s103","Operating Systems",100);
            
            // for(sRecords s:subs)
            //     System.out.println(s);
        
    }
}
