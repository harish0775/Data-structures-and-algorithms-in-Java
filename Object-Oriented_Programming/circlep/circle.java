package circlep;
/**
 * circle
 */
class circle {
   public double radius;

    public double area(){
        return Math.PI * radius * radius;
    }
    public double circumference(){
        
        return 2*Math.PI*radius*radius;
    }
}
