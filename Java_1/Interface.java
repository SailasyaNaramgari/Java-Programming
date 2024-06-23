//An interface in Java is a blueprint of a class. It has static constants and abstract methods.
// The interface in Java is a mechanism to achieve abstraction.
//interface is not class like abstract


//class to class -> extends
//class to interface -> implements
//interface  to interface  -> extends

interface Computer1{ //instead of abstract class we can use interface
    void Code();  //contains public abstract bts
    //int age; variables in interface are final and static
    int age = 20;
}

interface X{
    void run();
}

interface Y extends X{ // for interface inheritance we use extends

}

// we can have a class implementinng multiple interfaces
class Laptop1 implements Computer1,Y{ //implements instead of extends
    public void Code(){
        System.out.println("code..compile..run");

    }

    public void run() {
        System.out.println("running");
    }
}

class Desktop implements Computer1{
    public void Code(){
        System.out.println("code..compile..run : FASTER");

    }
}

class Developer{
    public void devApp(Computer1 lap){
        lap.Code();
    }
}

public class Interface {
    public static void main(String a[]){
        Computer1 lap = new Laptop1();
        Computer1 desk = new Desktop();

        Developer lasya = new Developer();
        lasya.devApp(lap);
        lasya.devApp(desk);

        //lasya.devApp(desk);
        //won't work as devApp won't take Desktop class but it works after we use computer class

        System.out.println(Computer1.age);
        //Computer1.age = 21; //cannot change as it is final and static
    }
}
