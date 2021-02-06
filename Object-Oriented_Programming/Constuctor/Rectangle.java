package Constuctor;

public class Rectangle {
        public double length,breath,radius;
         public double perimeter(){
             return 2*(length*breath);
    
         }
         public double Area(){
             return length*breath;
         }
         public boolean isSquare(){
             if(length == breath){
                 return true;
             }
             return false;
    
         }
    }
     
