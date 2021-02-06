package getset;
import java.util.Scanner;
import circle.Main;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int br = s.nextInt();
        int ln = s.nextInt();
        Rectangle r1 = new Rectangle();
        r1.setbreath(br);
        r1.setlength(ln);
        System.out.println("Area:"+r1.area());
    }
    
}
