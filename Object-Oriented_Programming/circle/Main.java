package circle;

public class Main {
        public static void main(String[] args) {

            // Circle .....
            circle c1 = new circle();
            c1.radius=7;
            System.out.println("Area:"+c1.area());

            // rectangle.....
            Rectangle R1 = new Rectangle();
             R1.length = 23;
            R1.breath = 3; 
            System.out.println("Rectangle :"+R1.Area());
            System.out.println("Rectangle :"+R1.isSquare());

            //Cyclinder.......
            Cyclinder cl = new Cyclinder();
           cl.height = 28;
           cl.radius = 13;
            
            System.out.println("Curverd_Surface :"+cl.Curved_Surface());
            System.out.println("Volume :"+ cl.Volume());
            
        }
        }

