package student;

import java.util.Scanner; // import the Scanner class 

public class main{

        public static void main(String[] args) 
        {
                Scanner scn = new Scanner(System.in);
                
                System.out.print("Enter the Course List: ");  
                //reading the number of elements from the that we want to enter  
                int courseName = scn.nextInt();  
                int Nocouse = scn.nextInt();
                //creates an array in the memory of length 10  
                
                int[] array1 = new int[Nocouse];
                int[] array2 = new int[courseName];
                System.out.println("Enter the elements of the array: ");  
                for (int i,j = 0; i < Nocouse && j< courseName;i++) {
                

                     //input student Deltails


                    int course = array2[j];
                    array2[j]=scn.nextInt();



                            // for(int j=0; j<courseName; j++)  
                            // {  
                            // //reading array elements from the user   
                            //  
                            // }  
               System.out.println("How Many Course");
                   System.out.println("Course-Name"+"Marks");









































                System.out.println("StudentName: ");
                String name = scn.nextLine();
               
                System.out.println("Marks1: ");
                int marks1 = scn.nextInt();
                System.out.println("Marks2: " );
                int marks2 = scn.nextInt();
                System.out.println("Marks3: " );
                int marks3 = scn.nextInt();
                student s=new student();
            
            s.roll=1;
            s.name=name;
            s.course="CS";
            s.m1= marks1;
            s.m2=marks2;
            s.m3=marks3;
            
            System.out.println("Average :"+s.average());
            
            System.out.println("Details:\n "+ s );
            
        }
}