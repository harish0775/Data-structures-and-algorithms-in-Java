package perimetrise_constructor;



class Parent
{
    public Parent()
    {
        System.out.println("Parent Constrcutor");
    }
            
}

class Child extends Parent
{
    public String Child()
    {
        String childName = "Ram";
        System.out.println("Child Constructor");
        return childName;
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }

    public String parent() {
        return null;
    }
}
public class InheritConst 
{

    public static void main(String[] args) 
    {

        GrandChild c =new GrandChild();   
             System.out.println("grandchil:"+c.Child());
    }
    
}