class Mob{
    String brand;
    int price;
    static String name; //change for all objects

    static{ //called only pnce
        name = "Phone";
        System.out.println("In static block");

    }
    public void Mob(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
        //name = "phone"; //initialisee static variable inside constructor
    }

    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }
}

public class StaticBlock{
    public static void main(String a[]) {
        Mob obj1 = new Mob();
        obj1.brand = "Apple";
        obj1.price = 100000;
        Mob.name = "smart phone"; // as name is static we use Mobile

        Mob obj2 = new Mob();

    }
}

//revise again
