package subject;

public class main {

        public static void main(String[] args) 
        {
            sRecords subs[]=new sRecords[3];
            subs[0]=new sRecords("s101","DS",100);
            subs[1]=new sRecords("s102","Algorithms",100);
            subs[2]=new sRecords("s103","Operating Systems",100);
            
            for(sRecords s:subs)
                System.out.println(s);
        
    }
}
