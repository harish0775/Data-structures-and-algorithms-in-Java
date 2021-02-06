package Constuctor;

public class main {
        public static void main(String[] args) {

            // Circle .....
            Rectangle c1 = new Rectangle();
            c1.radius=7;
            System.out.println("Area:"+c1.Area());

            // rectangle.....
            Rectangle R1 = new Rectangle();
             R1.length = 23;
            R1.breath = 3; 
            System.out.println("Rectangle :"+R1.Area());
            System.out.println("Rectangle :"+R1.isSquare());
            
        }
        }

