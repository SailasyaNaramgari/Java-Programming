class Human{
    private int age;  //age is accessible only in same class
    private String name;

    // we can generate getters and setters - right click
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

public class Encapsulation {
    public static void main(String a[]) {
        Human obj = new Human();
        obj.setAge(19);
        obj.setName("lasya");

        System.out.println(obj.getName()+": "+obj.getAge()); //Acess it through methods
    }
}
