enum Status1{
    Running, Failed, Pending, Success;  //prebuilt

}

enum Laptop2{
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);
    private int price;

    private Laptop2(int price) {
        this.price = price;
    }

    private Laptop2() { //default constructor
        price= 2200; // if we didn't mention price, it displays this default value
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class Enum_IfSwitch {
    public static void main(String a[]){

        System.out.println("---------Example 1-------------");

        //if in enum

        Status1 s = Status1.Pending;

        if (s == Status1.Running)
            System.out.println("All good");
        else if (s == Status1.Failed)
            System.out.println("Try again");
        else if (s == Status1.Pending)
            System.out.println("Please wait");
        else
            System.out.println("Done");


        System.out.println(s.getClass().getAnnotatedSuperclass());

        System.out.println("----------------------");

        // switch in enum

        Status1 s1 = Status1.Success;

        switch (s1){
            case Running -> System.out.println("All good");
            case Failed -> System.out.println("Try again");
            case Pending -> System.out.println("Please wait");
            case Success -> System.out.println("Done");
        }

        System.out.println("---------Example 2-------------");


        Laptop2 lap = Laptop2.Macbook;
        System.out.println(lap +" : "+ lap.getPrice());

        System.out.println("----------------------");

        for (Laptop2 lap1 : Laptop2.values()){
            System.out.println(lap1 +" : "+ lap1.getPrice());
        }

    }
}

//enum cannot extend class. As it is a class, it can do remaining