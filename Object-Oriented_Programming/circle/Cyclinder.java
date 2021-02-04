package circle;



public class Cyclinder {
    public double radius,height;
    public double Curved_Surface(){   //Curved Surface Area = 2πrh square units

       return 2*(Math.PI*radius*height);
    }
    public double Total_Surface(){   //Total surface area, A = 2πr(r+h) square units
        return 2*Math.PI*radius*(radius+height);
     }
     public double Volume(){  //Volume of the Cylinder, V = πr2h cubic units
        return Curved_Surface();
     }

     

}
