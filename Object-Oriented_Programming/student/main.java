package student;

import java.util.Scanner; // import the Scanner class 

public class main{

        public static void main(String[] args) 
        {
               
                Scanner scn=new Scanner(System.in);  
                System.out.print("Enter the number of elements you want to store: ");  
                //reading the number of elements from the that we want to enter  
                int n=scn.nextInt();  
                int k;
                k = n;
                //creates an array in the memory of length 10  
                String[] array1 = new String[n]; 
                String [] array2 = new String [k];
                int[] array3 = new int[n]; 
                System.out.println("Enter the elements of the array: ");  
                 int j = 0;
                 int l =0;
                       for(int i=0; i<n&&j<n&&l<n; i++,j++,l++)  
                               {  
                                       j =i;
                                       l = i;
                                //        String id  = array1[i];
                                //        String cname = array2[j];
                                      System.out.println("course id"+"cname"+"marks");
                                         array1[i]=scn.nextLine();
                                         array2[j]= scn.nextLine();
                                         array3[l] = scn.nextInt();
                                        //reading array elements from the user   
                                       
                                         System.out.println("printCourse"+array1[i]+"courseName"+array2[j]+"Marks"+array3[l]);
                                        } 
                                
                            
                     
                // System.out.println("StudentName: ");
                // String name = scn.nextLine();
               
        //         System.out.println("Marks1: ");
        //         int marks1 = scn.nextInt();
        //         System.out.println("Marks2: " );
        //         int marks2 = scn.nextInt();
        //         System.out.println("Marks3: " );
        //         int marks3 = scn.nextInt();
        //         student s=new student();
            
        //     s.roll=1;
        //     s.name=name;
        //     s.course="CS";
        //     s.m1= marks1;
        //     s.m2=marks2;
        //     s.m3=marks3;
            
        //     System.out.println("Average :"+s.average());
            
        //     System.out.println("Details:\n "+ s );
            
        }
}