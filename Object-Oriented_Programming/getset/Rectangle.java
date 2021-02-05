package getset;


public class Rectangle {
    public int length;
    public int breath;
    public int radius;


    public int getlength(){
         return length;
     }
    public void setlength(int l) {
        if(length < 0){
            System.out.println("length not 0");
        }else{
            length = l;
        }
    }
        public int getbreath(){
            return length;
        }
       public void setbreath(int b){
           if(breath < 0){
               System.out.println("length not 0");
           }else{
              breath = b;
           }
        }
    public double area(){
        return getlength()*getbreath();

    }
    public double perimeter(){
        return 2*(getlength()+getbreath());
    }
    public boolean isSquare(){
        if(length == breath){
            return true;
        }else{
            return false;
        }
    
}
}
