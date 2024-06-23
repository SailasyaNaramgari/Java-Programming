class Human1{
    private int age;
    private String name;

    //constructor - looks like method itself
    //Default constructor
    public Human1(){ //no need to mention return type and name should be same as class name
//        System.out.println("Int Constructor");
        age = 12;
        name = "sai";
    }

    public Human1(int a, String n){ //Parameterised constructor
        age = a;
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Constructor{
    public static void main(String a[]) {
        Human1 obj = new Human1();
        System.out.println(obj.getName()+" : "+obj.getAge()); //Acess it through methods

        Human1 obj1 = new Human1(20,"sai lasya");
        System.out.println(obj1.getName()+" : "+obj1.getAge()); //Acess it through methods

        System.out.println("--------------");

        obj.setAge(19);
        obj.setName("lasya");

        System.out.println(obj.getName()+": "+obj.getAge()); //Acess it through methods
    }
}
