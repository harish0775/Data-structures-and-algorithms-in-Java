package Master_Branch_Data_Structure_JAVA.classObject;

public class person {
    private String name;
    private int age;

    public person(){
       System.out.println("I am a default  constructor");
    }
    public  person(int age){
        System.out.println("I am one parameter conastructor");
        this.age = age;
    }
    public person(int age , String name){
        System.out.println("I am two perimeter constructor");
        this.age = age;
        this.name = name;
    }
	public String getName(){
        return name;
    }
    public int  getAge(){
        return age;
    
    }
}
